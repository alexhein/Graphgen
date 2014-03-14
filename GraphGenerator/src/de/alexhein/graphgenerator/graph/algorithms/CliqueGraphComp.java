package de.alexhein.graphgenerator.graph.algorithms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraphEdged;
import de.alexhein.graphgenerator.graph.triangulation.SimpleNodeElimTriangulator;

public class CliqueGraphComp {

	public CliqueGraphComp() {
		// TODO Auto-generated constructor stub
	}
	
	public static <T> List<T> getNodeElimOrder(final UndirectedGraph<T> g) {
		

		Set<T> unmarked = g.getNodes();
		Map<T, Integer> mncount = new HashMap<T, Integer>();
		LinkedList<T> ordering = new LinkedList<T>();
		
		
		for(T n : g.getNodes())
			mncount.put(n, 0);
	
		
		T next = null;
		int maxcnt;
		while(!unmarked.isEmpty()) {
		
			maxcnt = 0;
			for(T node : unmarked) {
				int c = mncount.get(node);
				if(c >= maxcnt) {
					next = node;
					maxcnt = c;
				}
			}
			
			// 
			for(T neighb : g.getNeighbours(next)) {
				int c = mncount.get(neighb);
				mncount.put(neighb, c+1);
			}
			unmarked.remove(next);
			ordering.addLast(next);
			
		}
		
		
		return ordering;
		
		
	}
	
	public static <T> UndirectedGraphEdged<Set<T>, Set<T>> getCliqueGraph(final UndirectedGraph<T> g) {
		
		UndirectedGraph<T> chordg = new SimpleNodeElimTriangulator().triangulate(g);
		
		List<T> order = CliqueGraphComp.getNodeElimOrder(chordg);
		
		
		
	
		
	
	}

}
