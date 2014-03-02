package de.alexhein.graphgenerator.logic.scopes;

public interface Enumerator<T> {

	public int code(T o);
	public T unCode(int l);
	public int getTotalSize();
}
