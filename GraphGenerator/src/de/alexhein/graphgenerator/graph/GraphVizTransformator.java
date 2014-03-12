/**
 * 
 */
package de.alexhein.graphgenerator.graph;

/**
 * @author alex
 *
 */
public interface GraphVizTransformator {
	public String toGraphViz(UndirectedGraph<?> g);

	public String toGraphViz(UndGraphHashed<?> g);
}
