package de.alexhein.graphgenerator.logic;

import de.alexhein.graphgenerator.logic.scopes.Constant;
import de.alexhein.graphgenerator.logic.scopes.Variable;

public class Instantiation implements Argument {
	
	private final Variable var;
	private final Constant cons;
	
	Instantiation(Variable v, Constant c) {
		this.var = v;
		this.cons = c;
	}
	
	public Variable getVariable() {
		return this.var;
	}
	
	public Constant getConstant() {
		return this.cons;
	}
	
	@Override
	public String toString() {
		String str = this.var.toString() + "<-" + this.cons.toString();
		return str;
	}

	@Override
	public boolean isVariable() {
		// TODO Auto-generated method stub
		return false;
	}

}
