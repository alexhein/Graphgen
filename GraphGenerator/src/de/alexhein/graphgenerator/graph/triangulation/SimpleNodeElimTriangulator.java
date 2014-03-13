/**
 * 
 */
package de.alexhein.graphgenerator.graph.triangulation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import de.alexhein.graphgenerator.graph.datastructures.UndGraphHashed;
import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph;

/**
 * @author alex
 *
 */
public class SimpleNodeElimTriangulator implements Triangulator {

	/**
	 * 
	 */
	public SimpleNodeElimTriangulator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see de.alexhein.graphgenerator.graph.triangulation.Triangulator#triangulate(de.alexhein.graphgenerator.graph.UndirectedGraph)
	 */


	@Override
	public <T> UndirectedGraph<T> triangulate(UndirectedGraph<T> g) {
		
		
		UndGraphHashed<T> tg = new UndGraphHashed<T>(g);
	
		Iterator<T> nodeIt = tg.getNodes().iterator();
		
		Set<T> visited = new HashSet<T>();
		while(nodeIt.hasNext()) {
			T node = nodeIt.next();
			visited.add(node);
			for(T n : g.getNeighbours(node)) 
				for(T m : g.getNeighbours(node))
					if(!visited.contains(n) && !visited.contains(m))
						tg.addEdge(n, m);
			
		}
		return tg;
	}

}
