package org.test.dp.behavioral.iterator.model;

public interface Iterator<T>
{
	boolean hasNext();
	T next();
	void remove();
	void add(T t);
	// optional
	void reset();
}
