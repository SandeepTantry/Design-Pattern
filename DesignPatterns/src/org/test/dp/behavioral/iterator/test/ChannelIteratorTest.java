package org.test.dp.behavioral.iterator.test;

import static org.test.dp.behavioral.iterator.model.ChannelCollection.ChannelTypeEnum.ALL;
import static org.test.dp.behavioral.iterator.model.ChannelCollection.ChannelTypeEnum.ENGLISH;
import static org.test.dp.behavioral.iterator.model.ChannelCollection.ChannelTypeEnum.HINDI;
import static org.test.dp.behavioral.iterator.model.ChannelCollection.ChannelTypeEnum.KANNADA;
import static org.test.dp.behavioral.iterator.model.ChannelCollection.ChannelTypeEnum.NONE;

import org.test.dp.behavioral.iterator.model.Channel;
import org.test.dp.behavioral.iterator.model.ChannelCollection;
import org.test.dp.behavioral.iterator.model.ChannelCollectionImpl;
import org.test.dp.behavioral.iterator.model.ChannelIterator;

public class ChannelIteratorTest
{
	public static void main(String[] args)
	{
		final Channel ch1 = new Channel(91.1, "Radio City", KANNADA);
		final Channel ch2 = new Channel(91.9, "Radio Indigo", ENGLISH);
		final Channel ch3 = new Channel(92.7, "Big", KANNADA);
		final Channel ch4 = new Channel(93.5, "Red FM", HINDI);
		final Channel ch5 = new Channel(94.3, "Radio One", ENGLISH);
		final Channel ch6 = new Channel(95.0, "Radio Mirchi (Radio 95)", HINDI);
		final Channel ch7 = new Channel(98.3, "Radio Mirchi", KANNADA);
		final Channel ch8 = new Channel(100.1, "Amrutavarshini", NONE);
		final Channel ch9 = new Channel(101.3, "FM Rainbow", ALL);
		final Channel ch10 = new Channel(102.9, "Vivid Bharati", ALL);
		final Channel ch11 = new Channel(104, "Fever", HINDI);
		final Channel ch12 = new Channel(106.4, "Gyanvani", NONE);
		
		final ChannelCollection<Channel> collection = new ChannelCollectionImpl();
		collection.addChannel(ch1);
		collection.addChannel(ch2);
		collection.addChannel(ch3);
		collection.addChannel(ch4);
		collection.addChannel(ch5);
		collection.addChannel(ch7);
		collection.addChannel(ch9);
		collection.addChannel(ch11);
		
		ChannelIterator<Channel> iterator = collection.iterator(KANNADA);
		/*while(iterator.hasNext())
		{
			System.out.println(iterator.next().toString());
		}*/
		//iterator.next();
		
		// next/prev
		/*iterator = collection.iterator(HINDI);
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		while(iterator.hasPrev())
		{
			System.out.println(iterator.prev());
		}*/
		
		// add
		iterator = collection.iterator(ENGLISH);
		while(iterator.hasNext())
		{
			final Channel ch = iterator.next();
			if (ch.getFrequency() == 98.3)
			{
				iterator.add(ch6);
			}
		}
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		// first/ last
		System.out.println("First station --> " + iterator.first());
		System.out.println("Last station --> " + iterator.last());

		// remove
		// TODO : fixme
		/*while(iterator.hasPrev())
		{
			final Channel ch = iterator.prev();
			if (ch.getFrequency() == 95.0)
			{
				iterator.remove();
			}
		}
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}*/
	}
}
