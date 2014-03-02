package de.alexhein.graphgenerator.logic.scopes;

import de.alexhein.graphgenerator.logic.Argument;

public class Variable implements Argument {
	
	private final String name;
	private final Sort sort;

	
	Variable(String n, Sort s){
		this.name = n;
		this.sort = s;

	}
	
	public String toString(){
		return this.name;
	}
	
	public String getName() {
		return this.name;
	}

	public Sort  getSort() {
		return this.sort;
	}

	@Override
	public boolean isVariable() {
		return true;
	}

}
