/**
 * 
 */
package de.alexhein.graphgenerator.graph;

import de.alexhein.graphgenerator.graph.datastructures.UndGraphHashed;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;

/**
 * @author alex
 *
 */
public interface GraphVizTransformator {
	public String toGraphViz(UndirectedGraph<?> g);

	public String toGraphViz(UndGraphHashed<?> g);
}
