package org.test.dp.behavioral.iterator.model;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection<Channel>
{
	private List<Channel> channels = new ArrayList<Channel>();
	
	@Override
	public void addChannel(final Channel c)
	{
		// TODO : use Iterator to add the channels
		channels.add(c);
	}

	@Override
	public void removeChannel(final Channel c)
	{
		// TODO : use Iterator to remove the channels
		channels.remove(c);
	}

	/*@Override
	public ChannelIterator<Channel> iterator(final ChannelTypeEnum type)
	{
		return new ChannelIteratorImpl(type);
	}*/
	
	public ChannelIterator<Channel> iterator(final ChannelTypeEnum type)
	{
		return new ChannelIteratorImpl();
	}
	
	private int getLength()
	{
		return channels.size();
	}
	
	// private inner class
	private class ChannelIteratorImpl implements ChannelIterator<Channel>
	{
		private int index;
		/*private ChannelTypeEnum type;
		private List<Channel> channelsList;
		
		private ChannelIteratorImpl(final ChannelTypeEnum type)
		{
			this.type = type;
			this.channelsList = channels;
		}*/

		@Override
		public boolean hasNext()
		{
			if (index < getLength())
			{
				return true;
			}
			return false;
		}

		@Override
		public boolean hasPrev()
		{
			if (index > 0)
			{
				return true;
			}
			return false;
		}

		@Override
		public Channel next()
		{
			if (hasNext())
			{
				return channels.get(index++);
			}
			throw new RuntimeException("No more elements to display");
		}

		@Override
		public Channel prev()
		{
			if (hasPrev())
			{
				return channels.get(--index);
			}
			throw new RuntimeException("This is the first element. No prev element"); 
		}

		@Override
		public Channel first()
		{
			index = 0;
			return channels.get(index);
		}

		@Override
		public Channel last()
		{
			index = channels.size() - 1;
			return channels.get(index);
		}

		@Override
		public void add(final Channel t)
		{
			if (hasNext())
			{
				channels.add(index - 1, t);
			}
			else
			{
				channels.add(t);
			}
			++index;
		}

		@Override
		public void remove(final Channel t)
		{
			if (channels.contains(t))
			{
				channels.remove(t);
			}
			else
			{
				throw new RuntimeException("No matching channel found");
			}
		}
		
		@Override
		public void remove()
		{
			if (index > 0)
			{
				channels.remove(index - 1);
			}
			
			throw new RuntimeException("No channels to remove");
		}
	}
}
