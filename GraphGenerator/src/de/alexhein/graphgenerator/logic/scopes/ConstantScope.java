package de.alexhein.graphgenerator.logic.scopes;

import java.util.HashMap;
import java.util.Map;

public class ConstantScope {

	private final Map<String, Constant> consts = new HashMap<String, Constant>();

	
	public Constant getInstance(String str){
		Constant c = consts.get(str);
		if(c == null){
			c = new Constant(str);
			consts.put(str, c);
		}
		return c;
	}
	
	public Constant getConstant(String str){
		return consts.get(str);
	}
	
	public int getSize() {
		return consts.size();
	}
}
