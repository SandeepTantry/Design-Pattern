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
			System.out.print(it.next() + ", ");
		}
		
		// will throw exception if next is done.
		//System.out.println(it.next());

		
		// REMOVE operation
		System.out.println();
		//it  = names.iterator();
		it.reset();
		while (it.hasNext())
		{
			String name = it.next();
			if (name != null && name.contains("Man"))
			{
				it.remove();
			}
		}
		//it.remove();
		
		System.out.println();
		it.reset();
		while (it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		
		// ADD operation
		System.out.println();
		it.reset();
		while (it.hasNext())
		{
			String name = it.next();
			if (name != null && name.contains("Kul"))
			{
				it.add("Mandeep");
			}
		}
		
		System.out.println();
		it.reset();
		while (it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
	}
}
