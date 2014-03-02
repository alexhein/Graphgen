/**
 * 
 */
package de.alexhein.graphgenerator.logic.scopes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.alexhein.graphgenerator.logic.Argument;
import de.alexhein.graphgenerator.logic.GroundRelation;
import de.alexhein.graphgenerator.logic.ProbConstrConditional;
import de.alexhein.graphgenerator.logic.Relation;

/**
 * @author alex
 *
 */
public class RelTypeScope implements Enumerator<GroundRelation> {

	private final Map<String, RelType> reltypes = new HashMap<String, RelType>();
	private final Map<GroundRelation, Integer> relkeymap = new HashMap<GroundRelation, Integer>();
	private final Map<Integer, GroundRelation> numberkeymap = new HashMap<Integer, GroundRelation>();
	
	
	
	
	
	
	public RelType getInstance(String str, Sort[] args) {
		if(reltypes.containsKey(str)) {
				System.err.println("Warning: Redefinition of Relation Type in Scope. No construction.");
				return reltypes.get(str);
			}
		else {
			RelType nrt = new RelType(str, args);
			reltypes.put(str, nrt);
			
			VariableScope vs = new VariableScope();
			String vname = "X";
			Argument[] varg = new Argument[args.length];
			for(int i=0; i<varg.length; i++) {
				varg[i] = vs.getInstance(vname+Integer.toString(i), args[i]);
			}
			Relation r = new Relation(nrt, varg);
			ProbConstrConditional pcc = new ProbConstrConditional(r, 0, null, vs);
	
		
		
			Iterator<GroundRelation> it = pcc.getAllGroundedRelations().iterator();
			
			int i = relkeymap.size();
			while(it.hasNext())
			{
				GroundRelation grel = it.next();
				relkeymap.put(grel, i);
				numberkeymap.put(i, grel);
				i++;
			}
				
			
			return nrt;
		}
	}
	
	@Override
	public GroundRelation unCode(int c) {
		return numberkeymap.get(c);
	}
	
	@Override
	public int code(GroundRelation gr) {
		if(relkeymap.containsKey(gr))
			return relkeymap.get(gr);
		else 
			return -1;     
	}
	
	@Override
	public String toString() {
		String str = "";
		Iterator<RelType> rti = reltypes.values().iterator();
		while(rti.hasNext())
			str = str + rti.next().toString() + "\n";
		return str;
	}
		
	public RelType getRelType(String str) {
		return reltypes.get(str);
	}

	@Override
	public int getTotalSize() {
		return relkeymap.size();
	}
	  
}
