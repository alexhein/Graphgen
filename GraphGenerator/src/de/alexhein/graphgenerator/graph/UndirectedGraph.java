/**
 * 
 */
package de.alexhein.graphgenerator.graph;

import java.util.Set;

/**
 * @author Alexander Hein
 * 
 *
 */

public interface UndirectedGraph<T> {
	
	/**
	 * @param node 
	 * Node of type <T> to be inserted
	 * @return
	 * true iff the Graph does not already contains node
	 */
	public boolean containsNode(T node);
	
	public boolean containsEdge(T node1, T node2);
	public boolean adjacent(T node1, T node2);
	
	public boolean addNode(T node);
	public boolean addEdge(T node1, T node2);
	
	public boolean removeNode(T node);
	public boolean removeEdge(T node1, T node2);
	
	public boolean addClique(Set<T> nodes);
	
	public int getNumberOfNodes();
	public int getNumberOfEdges();
	
	@Override
	public String toString();
	
	public String toGraphVizFormat();
	
	
	
}
