package org.test.dp.behavioral.iterator.model;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements Container<String>
{
	private static final List<String> NAMES =
	    new ArrayList<String>(asList("Sandeep", "Mandeep", "Kuldeep", "Sudeep", "Pradeep"));
	
    @Override
	public Iterator<String> iterator()
    {
    	return new NameIterator();
	}
    
    private class NameIterator implements Iterator<String>
    {
    	int index;

		@Override
		public boolean hasNext()
		{
			if (index < NAMES.size())
			{
				return true;
			}
			return false;
		}

		@Override
		public String next()
		{
			if (this.hasNext())
			{
				return NAMES.get(index++);
			}
			
			throw new RuntimeException("No more elements to display");
		}
    }
}
