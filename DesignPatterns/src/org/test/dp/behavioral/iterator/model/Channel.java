package org.test.dp.behavioral.iterator.model;

import org.test.dp.behavioral.iterator.model.ChannelCollection.ChannelTypeEnum;

public class Channel
{
	private double frequency;
	private String name;
	private ChannelTypeEnum type;
	
	public Channel(final double freq, final String name, final ChannelTypeEnum type)
	{
		this.frequency = freq;
		this.name = name;
		this.type = type;
	}

	public double getFrequency()
	{
		return frequency;
	}
	
	public String getName()
	{
		return name;
	}

	public ChannelTypeEnum gettype()
	{
		return type;
	}
	
	@Override
	public String toString()
	{
		return "Frequency = " + frequency + ", Name = " + name + ", Type = " + type;
	}
	
}