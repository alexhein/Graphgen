/**
 * 
 */
package de.alexhein.graphgenerator.logic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import de.alexhein.graphgenerator.logic.constraint.Constraint;
import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.Variable;
import de.alexhein.graphgenerator.logic.scopes.VariableScope;

/**
 * @author alex
 *
 */
public class InstantiationSet {
	
	
	private final Map<String, Instantiation> insts = new HashMap<String, Instantiation>(); 

	/**
	 * 
	 */
	public InstantiationSet() {
		// TODO Auto-generated constructor stub
	}
	
	public Iterator<Instantiation> iterator() {
		return insts.values().iterator();
	}
	
	public void add(Instantiation ins) {
		insts.put(ins.getVariable().getName(), ins);
	}
	
	public Constant getInstConstant(Variable v) {
		 Instantiation i = insts.get(v.getName());
		 return i.getConstant();
	}
	
	public Iterator<Instantiation> getInstIterator(){
		return insts.values().iterator();
	}
	
	@Override
	public String toString() {
		String str = "{";
		if(insts.size() > 0) {
			Iterator<Instantiation> cit = insts.values().iterator();
			str = str + cit.next().toString();
			while(cit.hasNext())
				str = str + "," + cit.next().toString();
		}
		str = str + "}";
		return str;
	}
	
	public static List<InstantiationSet> generateAllInsts(VariableScope vscope, Constraint cstr) {
		
		List<InstantiationSet> allinsts = new LinkedList<InstantiationSet>();
		
		if(vscope == null) 
			return allinsts;
		
		if(cstr == null)
			return generateAllInsts(vscope);
		
		Iterator<Variable> it = vscope.getVariableIterator();
		Constant[] instarr = new Constant[vscope.getSize()];
		
		Variable[] vararr = new Variable[vscope.getSize()];
		int i=0;
		while(it.hasNext())
			vararr[i++] = it.next();
		
		generate(instarr, vararr, 0, allinsts, cstr);
		
		return allinsts;
	}
	
	public static List<InstantiationSet> generateAllInsts(VariableScope vscope) { 
		Constraint uniconstr = new Constraint() {
			@Override
			public boolean fulfills(InstantiationSet is) {	
				return true;
			}
		};
		return generateAllInsts(vscope, uniconstr);
	}
	
	private static void generate
	(Constant[] carr, Variable[] varr, int pos, List<InstantiationSet> li, Constraint cstr) {
		
		if(pos == carr.length){
			InstantiationSet is = new InstantiationSet();
			for(int i=0; i<carr.length; i++) {
				Instantiation in = new Instantiation(varr[i], carr[i]);
				is.add(in);
			}
			if(cstr.fulfills(is))
				li.add(is);
		}
		else  { // pos < carr.length
			Iterator<Constant> it = varr[pos].getSort().getConstIterator();
			while(it.hasNext()) {
				carr[pos] = it.next();
				generate(carr, varr, pos+1, li, cstr);
			}
		}
		
		
	}

}
