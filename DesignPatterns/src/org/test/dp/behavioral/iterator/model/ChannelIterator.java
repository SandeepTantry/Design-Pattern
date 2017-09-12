package org.test.dp.behavioral.iterator.model;

public interface ChannelIterator<T>
{
	boolean hasNext();
	boolean hasPrev();
	T next();
	T prev();
	T first();
	T last();
	void add(T t);
	void remove(T t);
	void remove();
}
