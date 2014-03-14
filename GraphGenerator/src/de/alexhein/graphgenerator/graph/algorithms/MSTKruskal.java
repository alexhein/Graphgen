/**
 * 
 */
package de.alexhein.graphgenerator.graph.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import de.alexhein.graphgenerator.graph.datastructures.UndEdgeGraphHashed;
import de.alexhein.graphgenerator.graph.datastructures.UndGraphHashed;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph.Edge;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraphEdged;


/**
 * @author alex
 *
 */

// MAXINT !!
public class MSTKruskal implements MSTComp {


	
	/**
	 * 
	 */
	public MSTKruskal() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see de.alexhein.graphgenerator.graph.algorithms.MSTComp#computeMST(de.alexhein.graphgenerator.graph.UndirectedGraph, de.alexhein.graphgenerator.graph.algorithms.WeightMapper)
	 */
	
	@Override // null kantenAnnotationen
	public <T, ET> UndirectedGraphEdged<T, ET> computeMaxST(
			UndirectedGraphEdged<T, ET> g, WeightMapper<ET> wm) {
	
		UndirectedGraphEdged<T, ET> mst = new UndEdgeGraphHashed<T, ET>();
		for(T node : g.getNodes())
			mst.addNode(node);
		
		TreeSet<MSTComp.WeightedEdge<T>> sortedset = new TreeSet<MSTComp.WeightedEdge<T>>(); 
		
		
	
		
		for(UndirectedGraph.Edge<T> e : g.getEdges()) {
			T node1 = e.getFirstNode();
			T node2 = e.getSecondNode();
			ET ea = g.getEdgeAnnotation(node1, node2);
			double weight = 0;
			if(ea != null) // hier; oder statt 0 kanten ignorieren ?
				weight = wm.getWeight(g.getEdgeAnnotation(node1, node2));
			sortedset.add(new WeightedEdge<T>(e, weight));
		}
	
		UnionFinder<T> ufinder = new UnionFinder<T>(g.getNodes());
		
		
		
		while(!sortedset.isEmpty()) {
		
			WeightedEdge<T> we = sortedset.pollLast();
			T node1 = we.getEdge().getFirstNode();
			T node2 = we.getEdge().getSecondNode();
			
			
			if(ufinder.find(node1) != ufinder.find(node2)) {
				mst.addEdge(node1, node2, g.getEdgeAnnotation(node1, node2));
				ufinder.union(node1, node2);
			}
			
			
		}
		
		return mst;
		
	}

}
