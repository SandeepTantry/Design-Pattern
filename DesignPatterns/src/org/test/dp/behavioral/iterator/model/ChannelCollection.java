package org.test.dp.behavioral.iterator.model;

public interface ChannelCollection<T>
{
	void addChannel(T c);
	void removeChannel(T c);
	ChannelIterator<T> iterator(ChannelTypeEnum type);
	
	public enum ChannelTypeEnum
	{
		ENGLISH, HINDI, KANNADA, ALL, NONE;
	}
}
