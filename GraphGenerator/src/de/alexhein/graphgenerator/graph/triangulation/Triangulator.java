/**
 * 
 */
package de.alexhein.graphgenerator.graph.triangulation;

import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;

/**
 * @author Alexander Hein
 *
 */
public interface Triangulator {
	public <T> UndirectedGraph<T> triangulate(UndirectedGraph<T> g);
}
