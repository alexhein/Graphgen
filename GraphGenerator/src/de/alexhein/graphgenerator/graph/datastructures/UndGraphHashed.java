/**
 * 
 */
package de.alexhein.graphgenerator.graph.datastructures;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Alexander Hein
 *
 */
public class UndGraphHashed<T> implements UndirectedGraph<T> {

	
	protected final Set<T> nodes = new HashSet<T>();
	protected final Map<T, HashSet<T>> edges = new HashMap<T, HashSet<T>>();
	
	protected int edgecount = 0;
	protected int nodecount = 0;
	
	/**
	 * @param <S>
	 * 
	 */
	public <S extends T> UndGraphHashed(UndirectedGraph<S> g) {
		for(S n : g.getNodes())
			this.addNode(n);
		
		
		
		
		for(Edge<S> e : g.getEdges()) {
			this.addEdge(e.getFirstNode(), e.getSecondNode());			
		}	
	}
	
	public UndGraphHashed() {
		
	}
	
	@Override
	public boolean containsNode(T node) {
		return nodes.contains(node);
	}
	@Override
	public boolean adjacent(T node1, T node2) {
		if(!edges.containsKey(node1))
			return false;
		else
			return edges.get(node1).contains(node2);
	}
	@Override
	public boolean addNode(T node) {
		if(node == null) return false;
		if(nodes.contains(node))
			return false;
		else {
			nodes.add(node);
			edges.put(node, new HashSet<T>());
			if(this.edgecount < Integer.MAX_VALUE)
				nodecount++;
			return true;
		}
	}
	@Override
	public boolean addEdge(T node1, T node2) {
		
		if(node1 == null || node2 == null)
			return false;
		
		if(node1.equals(node2))
			return false;
		
		if(this.adjacent(node1, node2)) 
				return false;
		
		else {
			this.addNode(node1);
			this.addNode(node2);
			edges.get(node1).add(node2);
			edges.get(node2).add(node1);
			if(this.edgecount < Integer.MAX_VALUE)
				edgecount++;
			return true;
		}
	}
	@Override
	public boolean removeNode(T node) {
		if(node == null)
			return false;
		if(!nodes.contains(node))
			return false;
		else {
				
			Set<T> neighb = edges.get(node);
			for(T n : neighb) {
				edges.get(n).remove(node);
				this.edgecount--;
			}
			edges.remove(node);
			nodes.remove(node);
			this.nodecount--;
			return true;
		}
	}
	@Override
	public boolean removeEdge(T node1, T node2) {
		if(!this.adjacent(node1, node2))
			return false;
		else {
			edges.get(node1).remove(node2);
			edges.get(node2).remove(node1);
			this.edgecount--;
			return true;
		}
	}
	@Override
	public int getNumberOfNodes() {
		return this.nodecount;
	}
	@Override
	public int getNumberOfEdges() {
		return this.edgecount;
	}
	@Override
	public Set<T> getNodes() {
		Set<T> s = new HashSet<T>();
		for(T n : this.nodes)
			s.add(n);
		
		return s;
	}

	@Override
	public Set<Edge<T>> getEdges() {
		
		Set<Edge<T>> eset = new HashSet<Edge<T>>();
		
		Set<T> visited = new HashSet<T>();
		for(T n : this.nodes) {
			visited.add(n);
			for(T m : edges.get(n)) {
				if(!visited.contains(m)) {
					eset.add(new Edge<T>(n,m));
				}			
			}
		}
		return eset;
	}
	
	@Override
	public Set<T> getNeighbours(T node) {
		if(node == null)
			return null;
		if(!this.containsNode(node))
			return null;
		else {
			Set<T> s = new HashSet<T>();
			
			for(T n : edges.get(node))
				s.add(n);
			
			return s;
		}
	
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
		if(eit.hasNext())
			str = str + eit.next();
		
		while(eit.hasNext())
			str = " ," + eit.next();
		
		str = str + "}";
		
		return str;
	}

	


}
