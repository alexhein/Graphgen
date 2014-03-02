/**
 * 
 */
package de.alexhein.graphgenerator.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import de.alexhein.graphgenerator.logic.scopes.Enumerator;

/**
 * @author alex
 *
 */
public class RestrictedGraph<T> implements UndirectedGraph<T> {

	/**
	 * 
	 */
	
	private final boolean[] nodeSet;
	private final boolean[][] adjMatrix;
	private final Enumerator<T> enumerator;

	
	

	public RestrictedGraph(Enumerator<T> enmtr) {
		this.enumerator = enmtr;
		nodeSet = new boolean[enumerator.getTotalSize()];
		for(int i=0; i<nodeSet.length; i++)
			nodeSet[i] = false;

		
			adjMatrix = new boolean[nodeSet.length][];
			for(int i=0; i<nodeSet.length; i++) {
				adjMatrix[i] = new boolean[nodeSet.length];
				for(int j=0; j<nodeSet.length; j++)
					adjMatrix[i][j] = false;
			}
		
			
	}
	
	

	@Override
	public boolean contains(T node) {
		if(enumerator.code(node) == -1)
			return false;
		else
			return nodeSet[enumerator.code(node)];
	}

	@Override
	public boolean adjacent(T node1, T node2) {
		if(!this.contains(node1) || !this.contains(node2))
			return false;
		else
			return adjMatrix[enumerator.code(node1)][enumerator.code(node2)];
	}

	@Override
	public boolean addNode(T node) {
		if(enumerator.code(node) == -1)
			return false;
		else {
			if(nodeSet[enumerator.code(node)])
				return false;
			else {
				nodeSet[enumerator.code(node)] = true;
				return true;
			}
		}
	}
    // nur wenn beide knoten im Graphen vorhanden.
	@Override
	public boolean addEdge(T node1, T node2) {
	
		System.out.println("---------- "  + node1.toString() + " " + node2.toString());
	
		if(enumerator.code(node1) == -1 || enumerator.code(node2) == -1)
			return false;
		else {
			if(this.adjacent(node1, node2))
				return false;
			else {
				nodeSet[enumerator.code(node1)] = true;
				nodeSet[enumerator.code(node2)] = true;
				adjMatrix[enumerator.code(node1)][enumerator.code(node2)] = true;
				adjMatrix[enumerator.code(node2)][enumerator.code(node1)] = true;
				return true;
			}
		}
	}

	@Override
	// removes the node and all edges to adjacent nodes
	public boolean removeNode(T node) {
		if(!this.contains(node))
			return false;
		else {
			int index = enumerator.code(node);
			for(int i=0; i<nodeSet.length; i++) {
				adjMatrix[i][index] = false;
				adjMatrix[index][i] = false;
			}
			nodeSet[index] = false;
			return true;
		}
	}

	@Override
	public boolean removeEdge(T node1, T node2) {
		if(!this.adjacent(node1, node2))
			return false;
		else {
			adjMatrix[enumerator.code(node1)][enumerator.code(node2)] = false;
			adjMatrix[enumerator.code(node2)][enumerator.code(node1)] = false;
			return true;
		}
	}

	@Override
	public int getNumberOfNodes() {
		int n = 0;
		for(int i=0; i<nodeSet.length; i++)
			if(nodeSet[i] == true) 
				n++;
		return n;
	}

	@Override
	public int getNumberOfEdges() {

		return 0;
	}

	@Override
	public String toGraphVizFormat() {
		String str = "graph G { \n";
		for(int i=0; i<nodeSet.length; i++)
			for(int j=i+1; j<nodeSet.length; j++)
				if(adjMatrix[i][j] == true)
					str = str +"\"" + enumerator.unCode(i) + "\""+  " -- " + "\"" + enumerator.unCode(j) + "\""+ ";\n"; 
		str = str + "}";
		return str;
	}



	@Override
	public boolean addClique(Set<T> nodes) {
	
		Iterator<T> it = nodes.iterator();
		String str = "";
		while(it.hasNext()) {
			T x = it.next();
			str = str + enumerator.unCode(enumerator.code(x)).toString() + " "+ enumerator.code(x) + "    " ;
		
			
		
		}
		System.out.println(str);
		
		@SuppressWarnings("unchecked")
		T[] narr = (T[]) nodes.toArray();
		boolean allnew = true;
		
		for(int i=0; i<narr.length; i++){
			for(int j=i+1; j<narr.length; j++)
				allnew = this.addEdge(narr[i], narr[j]) && allnew;
		}
		
		return allnew;
	}

}
