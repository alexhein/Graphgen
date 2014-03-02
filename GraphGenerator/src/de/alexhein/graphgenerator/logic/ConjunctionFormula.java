package de.alexhein.graphgenerator.logic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjunctionFormula extends LogicalFormula {
	
	LogicalFormula conj1, conj2;
	public ConjunctionFormula(LogicalFormula c1, LogicalFormula c2){
		conj1 = c1;
		conj2 = c2;
	}
	@Override
	public String toString() {
		String s = "("+ conj1.toString() + " AND " + conj2.toString() + ")";
		return s;
	}

	@Override
	public LogicalFormula instantiate(InstantiationSet is) {
		LogicalFormula i1 = conj1.instantiate(is);
		LogicalFormula i2 = conj2.instantiate(is);
		return new ConjunctionFormula(i1, i2);
	}

	@Override
	public boolean isGround() {
		return conj1.isGround() && conj2.isGround();
	}
	@Override
	public Set<GroundRelation> getGroundAtoms() {
		Set<GroundRelation> s1 = conj1.getGroundAtoms();
		Set<GroundRelation> s2 = conj2.getGroundAtoms();
		s1.addAll(s2);
		return s1;
	}
	
	
	
}
