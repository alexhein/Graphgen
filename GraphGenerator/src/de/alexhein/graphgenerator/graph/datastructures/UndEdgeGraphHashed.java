/**
 * 
 */
package de.alexhein.graphgenerator.graph.datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.alexhein.graphgenerator.graph.datastructures.UndirectedGraph.Edge;



/**
 * @author alex
 *
 */
public class UndEdgeGraphHashed<T,ET> extends UndGraphHashed<T> implements UndirectedGraphEdged<T, ET> {

	protected final Map<Edge<T>, ET> annotations = new HashMap<Edge<T>, ET>();

	public UndEdgeGraphHashed(){
		
	}
	


	
	
	@Override
	public boolean addEdge(T node1, T node2, ET annot) {
		if(super.addEdge(node1, node2)) {
			annotations.put(new Edge<T>(node1, node2), annot);
			return true;
		}
		else
			return false;
	}
	
	@Override
	public boolean removeEdge(T node1, T node2) {
		if(super.removeEdge(node1, node2)) {
			annotations.remove(new Edge<T>(node1, node2));
			return true;
		}
		else
			return false;
	}
	
	@Override
	public boolean removeNode(T node) {
		
		Set<T> neighb = this.getNeighbours(node);
		if(neighb != null)
			for(T n : neighb)
				this.annotations.remove(new Edge<T>(node, n));
			
		return super.removeNode(node);
	}
	
	@Override
	public boolean addEdge(T node1, T node2) {
		return this.addEdge(node1, node2, null);
	}

	@Override
	public boolean setEdgeAnnotation(T node1, T node2, ET annot) {
		if(this.adjacent(node1, node2)) {
			this.annotations.put(new Edge<T>(node1, node2), annot);
			return true;
		}
		else
			return false;
	}

	@Override
	public ET getEdgeAnnotation(T node1, T node2) {
		return this.annotations.get(new Edge<T>(node1, node2));
	}





	@Override
	public boolean isFullyAnnotated() {
		for(ET a : annotations.values())
			if(a == null)
				return false;
	
		return true;
	}
	
	@Override
	public String toString() {
		String str = "Nodes: {";
		Iterator<T> itn = this.nodes.iterator();
		if(itn.hasNext())
			str = str + itn.next();
		while(itn.hasNext())
			str = str + ", " + itn.next();
		str = str + "}\n";
		
		str = str + "Edges: {";
		Iterator<Edge<T>> eit = this.getEdges().iterator();
		if(eit.hasNext()) {
			Edge<T> e = eit.next(); 
			str = str + e;
			if(annotations.get(e) != null)
				str = str + "[" + annotations.get(e) + "]";
			else
				str = str + "[]";
		}
		
		while(eit.hasNext()) {
			Edge<T> e = eit.next(); 
			str = str + e;
			if(annotations.get(e) != null)
				str = str + "[" + annotations.get(e) + "]";
			else
				str = str + "[]";
		}
			
		str = str + "}";
		
		return str;
	}
	
	
	
	
	

}
