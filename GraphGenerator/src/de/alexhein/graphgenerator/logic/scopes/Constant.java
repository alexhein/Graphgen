package de.alexhein.graphgenerator.logic.scopes;

import java.util.HashMap;
import java.util.Map;

import de.alexhein.graphgenerator.logic.Argument;

public class Constant implements Argument {
	
	private final String name;

	
	Constant(String constname){
		this.name = constname;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public boolean isVariable() {
		return false;
	}
}
