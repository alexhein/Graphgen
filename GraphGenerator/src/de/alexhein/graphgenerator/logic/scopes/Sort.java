package de.alexhein.graphgenerator.logic.scopes;

import java.util.Iterator;
import java.util.LinkedList;


public class Sort {

	private final String name;
	private final LinkedList<Constant> consts = new LinkedList<Constant>();
	
	Sort(String n, Constant[] cs) {
		this.name = n;
		for(int i=0; i<cs.length; i++) {
			consts.add(cs[i]);
		}
	}
	
	
	
	public Constant getConstant(String str) {
		Iterator<Constant> it = this.getConstIterator();
		while(it.hasNext()) {
			Constant c = it.next();
			if(c.getName().equals(str))
				return c;
		}
		return null;
	}
	
	public int getSize() {
		return consts.size();
	}
	
	public Iterator<Constant> getConstIterator(){
		return consts.iterator();
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
		String str = this.name + "={";
		Iterator<Constant> i = consts.iterator();
		if(i.hasNext())
			str = str + i.next().getName();
		while(i.hasNext()) {
			str = str + "," + i.next().getName();
		}
		str = str + "}";
		return str;
	}
}
