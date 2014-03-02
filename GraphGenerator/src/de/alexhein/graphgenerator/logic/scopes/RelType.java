package de.alexhein.graphgenerator.logic.scopes;



public class RelType {
	
	private final String name;
	private final int arity;
	private final Sort argsorts[];
	
	RelType(String str, Sort[] sp){
		this.name = str;
		this.arity = sp.length;
		this.argsorts = new Sort[this.arity];
		for(int i=0; i<arity; i++)
			argsorts[i] = sp[i];
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString() {
		String str = this.name;
		str = str + "(";
		
		if(arity > 0)
			str = str + argsorts[0].getName();
		for(int i=1; i<argsorts.length; i++)
			str = str + "," + argsorts[i].getName();
		str = str + ")";
		
		return str;
	}
	
	public int getArity() {
		return this.arity;
	}
	
	public Sort getArgSort(int i){
		return this.argsorts[i];
	}
	
}
