/**
 * 
 */
package de.alexhein.graphgenerator.graph.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;



/**
 * @author alex
 *
 */
public interface UndirectedGraph<T> {
	
	
	class Edge<T>{
		private final T node1, node2;
		
		protected Edge(T n1, T n2) {
			this.node1 = n1;
			this.node2 = n2;
		
		}
		public T getFirstNode() {
			return this.node1;
		}
		public T getSecondNode() {
			return this.node2;
		}
		@Override
		public boolean equals(Object o) {
			if(!(o instanceof Edge<?>))
				return false;
			
			Edge<?> r = (Edge<?>) o;
			
			if(r.node1.equals(this.node1) && r.node2.equals(this.node2))
				return true;
			if(r.node1.equals(this.node2) && r.node2.equals(this.node1))
				return true;
			
		
			return false;
		}
		@Override
		public int hashCode() {
			return node1.hashCode() + node2.hashCode();
		}
		
		@Override
		public String toString() {
			String str = "(" + node1 + "," + node2 + ")"; 
			return str;
		}
		
		
	}
	
	/**
	 * This method is used to determine if a given node is
	 * contained in the graph represented by this object.
	 * @param node 
	 * Reference to a node of type {@code<T>} to be inserted
	 * @return
	 * true iff {@code   (node != null) } and the the graph contains a 
	 * node reference {@code (node nr)} with {@code (nr.equals(node))}. 
	 */
	public boolean containsNode(T node);
	
	
	/**
	 * 
	 * 
	 * @param node1 
	 * @param node2
	 * @return true iff the edge specified by the two nodes as parameters 
	 * are not already contained in the graph.
	 * 
	 */
	public boolean adjacent(T node1, T node2);
	
	/**
	 * Adds a node (given a reference to it as parameter {@code  node}) to the Graph iff
	 * it is not already contained and {@code(node != null)} 
	 *
	 * 
	 * @param node 
	 * Reference to the node to be inserted
	 * @return true iff {@code node != null} and the node to be inserted is not already contained
	 */
	public boolean addNode(T node);
	
	/**
	 * Adds an (undirected) edge specified by by two nodes given as parameters. 
	 * 
	 * @param node1
	 * @param node2
	 * @return
	 */
	public boolean addEdge(T node1, T node2);
	
	public Set<T> getNeighbours(T node);
	
	
	public boolean removeNode(T node);
	
	public boolean removeEdge(T node1, T node2);
	
	
	public int getNumberOfNodes();
	
	
	public int getNumberOfEdges();
	
	public Set<T> getNodes();


	public Set<Edge<T>> getEdges();
	
	 
	
	
	
	
}
