package de.alexhein.graphgenerator.logic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisjunctionFormula extends LogicalFormula {

	private LogicalFormula dis1, dis2;
	
	public DisjunctionFormula(LogicalFormula d1, LogicalFormula d2){
		this.dis1 = d1;
		this.dis2 = d2;
	}
	


	@Override
	public String toString() {
		String s = "("+ dis1.toString() + " OR " + dis2.toString() + ")";
		return s;
	}

	@Override
	public LogicalFormula instantiate(InstantiationSet is) {
		LogicalFormula i1 = dis1.instantiate(is);
		LogicalFormula i2 = dis2.instantiate(is);
		return new DisjunctionFormula(i1,i2);
	}



	@Override
	public boolean isGround() {
		return dis1.isGround() && dis2.isGround();
	}



	@Override
	public Set<GroundRelation> getGroundAtoms() {
		Set<GroundRelation> s1 = dis1.getGroundAtoms();
		Set<GroundRelation> s2 = dis2.getGroundAtoms();
		s1.addAll(s2);
		return s1;
	}

}
