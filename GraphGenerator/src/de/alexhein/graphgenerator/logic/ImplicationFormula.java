package de.alexhein.graphgenerator.logic;

import java.util.List;
import java.util.Set;

public class ImplicationFormula extends LogicalFormula {

	LogicalFormula antecedent, consequent;
	
	public ImplicationFormula(LogicalFormula ant, LogicalFormula con){
		antecedent = ant;
		consequent = con;
	}
	

	@Override
	public String toString() {
		String s = "(" + antecedent.toString() + "=>" + consequent.toString() + ")";
		return s;
	}

	@Override
	public LogicalFormula instantiate(InstantiationSet is) {
		LogicalFormula nant = antecedent.instantiate(is);
		LogicalFormula ncon = consequent.instantiate(is);
		
		return new ImplicationFormula(nant, ncon);
	}



	@Override
	public boolean isGround() {
		return (antecedent.isGround() && consequent.isGround());
	}


	@Override
	public Set<GroundRelation> getGroundAtoms() {
		Set<GroundRelation> s1 = antecedent.getGroundAtoms();
		Set<GroundRelation> s2 = consequent.getGroundAtoms();
		s1.addAll(s2);
		return s1;
	}


	
}
