/**
 * 
 */
package de.alexhein.graphgenerator.graph.datastructures;


/**
 * @author alex
 *
 */
public interface UndirectedGraphEdged<T,ET> extends UndirectedGraph<T> {

	
	
	
	public boolean addEdge(T node1, T node2, ET annot);
	
	public boolean setEdgeAnnotation(T node1, T node2, ET annot);
	
	public  ET getEdgeAnnotation(T node1, T node2);
	
	public boolean isFullyAnnotated();
	
	
	
}
