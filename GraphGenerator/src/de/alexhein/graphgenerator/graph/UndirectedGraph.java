/**
 * 
 */
package de.alexhein.graphgenerator.graph;

import java.util.Set;

/**
 * @author alex
 *
 */
public interface UndirectedGraph<T> {
	
	public boolean contains(T node);
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
