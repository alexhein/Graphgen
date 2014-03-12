/**
 * 
 */
package de.alexhein.graphgenerator.graph;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @author alex
 *
 */
public interface UndirectedGraph<T> {
	/**
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


	public Set<Set<T>> getEdges();
	
	 
	
	
	
	
}
