package de.alexhein.graphgenerator.logic;

import java.util.List;
import java.util.Set;

public class NegationFormula extends LogicalFormula {

	private LogicalFormula form;
	
	public NegationFormula(LogicalFormula f){
		this.form = f;
	}
	


	@Override
	public String toString() {
		String s = "NOT(" + form.toString() + ")";
		return s;
	}

	@Override
	public LogicalFormula instantiate(InstantiationSet is) {
		return new NegationFormula(this.form.instantiate(is));
	}





	@Override
	public boolean isGround() {
		return form.isGround();
	}



	@Override
	public Set<GroundRelation> getGroundAtoms() {
	
		return form.getGroundAtoms();
	}

}
