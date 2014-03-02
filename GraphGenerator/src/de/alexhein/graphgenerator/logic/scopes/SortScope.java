/**
 * 
 */
package de.alexhein.graphgenerator.logic.scopes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author alex
 *
 */
public class SortScope {
	
	private final Map<String, Sort> sorts = new HashMap<String, Sort>();
	

    public Sort getInstance(String key, Constant[] cs) {
		
		if(sorts.containsKey(key)) {
			System.err.println("Redefinition of Sort in Scope. No construction.");
			return sorts.get(key);
		}
		else {
			Sort s = new Sort(key, cs);
			sorts.put(key, s);
			return s;
		}
	}
    
    @Override
    public String toString() {
    	String str = "";
    	Iterator<Sort> si = sorts.values().iterator();
    	while(si.hasNext())
    		str = str + si.next().toString() + "\n";
    	return str;
    }
    
    
    public Sort getSort(String name) {
    	return sorts.get(name);
    }

	public int getSize(){
		return sorts.size();
	}
	
	
	


}
