package de.alexhein.graphgenerator.logic;

import java.util.List;
import java.util.Set;

public class EquivalenceFormula extends LogicalFormula{
	
	private LogicalFormula antecedent, consequent;
	
	public EquivalenceFormula(LogicalFormula ant, LogicalFormula con){
		antecedent = ant;
		consequent = con;
	}
	


	@Override
	public String toString() {
		String s = "(" + antecedent.toString() + "<=>" + consequent.toString() + ")";
		return s;
		
	}

	@Override
	public LogicalFormula instantiate(InstantiationSet is) {
		LogicalFormula nant = antecedent.instantiate(is);
		LogicalFormula ncons = consequent.instantiate(is);
		return new EquivalenceFormula(nant, ncons);
	}


	@Override
	public boolean isGround() {
		return antecedent.isGround() && consequent.isGround();
	}
	
	@Override
	public Set<GroundRelation> getGroundAtoms() {
		Set<GroundRelation> s1 = antecedent.getGroundAtoms();
		Set<GroundRelation> s2 = consequent.getGroundAtoms();
		s1.addAll(s2);
		return s1;
	}
	
	

}
