/**
 * 
 */
package de.alexhein.graphgenerator.graph.algorithms;

import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraphEdged;

/**
 * @author alex
 *
 */
public interface MSTComp {
	
	class WeightedEdge<T> implements Comparable<WeightedEdge<T>> {
		private final UndirectedGraph.Edge<T> edge;
		private final double weight;
		
		WeightedEdge(UndirectedGraph.Edge<T> e, double w) {
			this.edge = e;
			this.weight = w;
		}
		public UndirectedGraph.Edge<T> getEdge(){
			return this.edge;
		}
		public double getWeight(){
			return this.weight;
		}
		@Override
		public int compareTo(WeightedEdge<T> o) {
			return  Double.compare(this.getWeight(), o.getWeight());
		}
	}
	

	public  <T, ET> UndirectedGraphEdged<T, ET> computeMaxST(UndirectedGraphEdged<T, ET> g, WeightMapper<ET> wm );

	
}
