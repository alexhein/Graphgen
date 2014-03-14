/**
 * 
 */
package de.alexhein.graphgenerator.graph.algorithms;

import java.util.Set;

/**
 * @author alex
 *
 */
public class SetSize<T> implements WeightMapper<Set<T>> {

	/**
	 * 
	 */
	public SetSize() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getWeight(Set<T> s) {
		return s.size();
	}

}
