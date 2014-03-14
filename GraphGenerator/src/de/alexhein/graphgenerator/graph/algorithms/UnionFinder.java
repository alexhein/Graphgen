/**
 * 
 */
package de.alexhein.graphgenerator.graph.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author alex
 *
 */
public class UnionFinder<T> {

	/**
	 * 
	 */
	
	private final Map<T, Integer> numbering = new HashMap<T, Integer>();
	private final int[] component;
	//maxint?
	public UnionFinder(Set<T> s) {
		component = new int[s.size()];
		int i=0;
		for(T e : s){
			component[i] = i;
			numbering.put(e, i);
			i++;
		}	
	}
	
	private int find(int x) {
		
		if(component[x] == x)
			return x;
		else
			return find(component[x]);
	}
	
	private void union(int x, int y) {
		component[find(x)] = find(y);
	}
	
	public boolean union(T e1, T e2) {
		if(!numbering.containsKey(e1) || !numbering.containsKey(e2))
			return false;
		else {
			union(numbering.get(e1), numbering.get(e2));
			return true;
		}
	}
	
	public int find(T e) {
		if(!numbering.containsKey(e))
			return -1;
		else 
			return find(numbering.get(e));
	}

}
