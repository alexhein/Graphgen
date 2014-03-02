package de.alexhein.graphgenerator.logic;

import java.util.Set;

public interface Instantiable<T> {
	
	public T instantiate(InstantiationSet is);

}
