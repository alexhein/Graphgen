/**
 * 
 */
package de.alexhein.graphgenerator.graph;

import de.alexhein.graphgenerator.graph.datastructures.UndGraphHashed;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph.Edge;

/**
 * @author alex
 *
 */
public class SimpleGVViz implements GraphVizTransformator {
	
	 

	@Override
	public <T> String toGraphViz(UndirectedGraph<T> g) {

		String str = "graph G {\n";
		for(Edge<T> e : g.getEdges()){
			str = str + "\"" + e.getFirstNode() + "\" "+ " -- " + "\"" +  e.getSecondNode() + "\""+ "\n"; 
		}
		return str + "}";
		
	}

	@Override
	public String toGraphViz(UndGraphHashed<?> g) {
		// TODO Auto-generated method stub
		return null;
	}






	

	


}
