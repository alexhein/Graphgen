package de.alexhein.graphgenerator.logic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import de.alexhein.graphgenerator.logic.constraint.Constraint;
import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.RelType;

public class Relation extends LogicalFormula {

	private final RelType rtype;
	private final Argument args[];
	
	public Relation(RelType rt, Argument[] a ) {
	
		this.rtype = rt;
		
		this.args = new Argument[a.length];
		for(int i=0; i<args.length; i++){
			args[i] = a[i];
		}
		
	}
	@Override
	public LogicalFormula instantiate(InstantiationSet instset) {
		Iterator<Instantiation> it = instset.iterator();
		
		Argument narg[] = new Argument[args.length];
		for(int i=0; i<args.length; i++)
			narg[i] = args[i];
		
		while(it.hasNext()) {
			Instantiation in = it.next();
			for(int i=0; i<args.length; i++) {
				if(in.getVariable() == args[i])
					narg[i] = in.getConstant();
			}
		}
		
		GroundRelation gr;
		Relation r = new Relation(this.rtype, narg);
		if(r.isGround()) {
			Constant cnarg[] = new Constant[narg.length];
			for(int i=0; i<narg.length; i++)
				cnarg[i] = (Constant) narg[i];
			gr = new GroundRelation(this.rtype, cnarg);
			return gr;
		}
		else return r;
	}
	
	public RelType getRelType(){
		return this.rtype;
	}
	
	public Iterator<Argument> getArgumentIterator(){
		List<Argument> l = new LinkedList<Argument>();
		for(int i=0; i<args.length; i++)
			l.add(args[i]);
		return l.iterator();
	}
	
	@Override
	public String toString() {
	
		String s = rtype.getName() + "(";
		if(args.length > 0){
			s = s + args[0].toString();
			for(int i=1; i<args.length; i++)
				s = s + "," + args[i].toString();
		}
		s = s + ")";
		return s;
	
	}

	
	@Override
	public boolean isGround() {
		for(int i=0; i<args.length; i++)
			if(args[i].isVariable()) return false;
		return true;
	}
	

	@Override
	public Set<GroundRelation> getGroundAtoms() {
		Set<GroundRelation> s = new HashSet<GroundRelation>();
		if(this.isGround())
		{
			Constant[] carr = new Constant[args.length];
			for(int i=0; i<args.length; i++)
				carr[i] = (Constant) args[i];
			s.add(new GroundRelation(this.rtype, carr));
		}
		return s;
	}


	
	
	

}
