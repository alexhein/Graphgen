/**
 * 
 */
package de.alexhein.graphgenerator.logic.scopes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import de.alexhein.graphgenerator.logic.Instantiation;

/**
 * @author alex
 *
 */
public class VariableScope {
	
	private final Map<String, Variable> vars = new HashMap<String, Variable>();
	
	public Variable getInstance(String key, Sort s) {
		
		if(vars.containsKey(key)) {
			Variable t = vars.get(key);
			if(t.getSort() == s) {
				return t;
			}
			else
			{
				System.err.println("Same variables with different types in same scope. No construction.");
				return t;
			}
		}
		else {
			Variable v = new Variable(key, s);
			vars.put(key, v);
			return v;
		}
	}
	
	

	public int getSize(){
		return vars.size();
	}
	
	public Variable getVariable(String key){
		Variable v = vars.get(key);
		return v;	
	}
	
	public Iterator<Variable> getVariableIterator() {
		return vars.values().iterator();
	}
	

		
	


}
