package org.test.dp.behavioral.iterator.test;

import org.test.dp.behavioral.iterator.model.Container;
import org.test.dp.behavioral.iterator.model.Iterator;
import org.test.dp.behavioral.iterator.model.NameRepository;

public class IteratorTester
{
	public static void main(String[] args)
	{
		final Container<String> names = new NameRepository();
		
		final Iterator<String> it = names.iterator();

		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// will throw exception if next is done.
		System.out.println(it.next());
	}
}
