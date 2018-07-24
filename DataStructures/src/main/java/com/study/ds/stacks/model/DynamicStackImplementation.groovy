package com.study.ds.stacks.model

import static java.util.Arrays.copyOf

import org.springframework.stereotype.Component

class DynamicStackImplementation
{
	private int size
	private int[] container
	private int top
	
	static main(args)
	{
		println 'Enter the size of the stack'
		def scanner = new Scanner(System.in)
		def size = scanner.nextInt()
		
		def stack = new DynamicStackImplementation(size)
		def toContinue = true
		while (toContinue)
		{
			println 'Please select following operations. 1.Push 2.Pop 3.Peek 4.Display'
			def opt = scanner.nextInt()
			
			switch(opt)
			{
				case 1 : println 'Enter the value to push'
				         def value = scanner.nextInt()
						 println(stack.push(value))
						 break
				
				case 2 : println(stack.pop())
				         break
						 
				case 3 : println(stack.peek())
				         break
				
				//case 4 :
				default : println 'Displaying the stack (by default)'
				          println(stack.displayFullElements())
			}

			println()
			println('Do you want to continue. 1.Yes 2.No')
			toContinue = scanner.nextInt() == 1
		}
	}
	
	DynamicStackImplementation(int size)
	{
		this.size = size
		container = new int[size]
		top = -1
	}
	
	void increaseCapacity()
	{
		def newSize = size * 2
		//def newStack = copyOf(container, newSize)
		container = copyOf(container, newSize)
		size = newSize
	}
	
	boolean isStackFull()
	{
		top == size - 1
	}
	
	boolean isStackEmpty()
	{
		top == -1
	}

	// operations
	String push(int value)
	{
		def msg = ''
		if (this.isStackFull())
		{
			msg = msg.concat('Stack is full. Increasing the capacity...')
			this.increaseCapacity()
		}
		container[++top] = value
		msg.concat('\nAdding ... ' + value)
	}
	
	String pop()
	{
		if (this.isStackEmpty())
		{
			'Stack is empty. No more elements to remove...' // we can throw exception instead  of just printing
		}
		else
		{
			def value = container[top]
			container[top--] = 0
			'Removing ... ' + value
		}
	}
	
	String peek()
	{
		if (!this.isStackEmpty())
		{
			'Topmost element is ... ' + container[top]
		}
		else
		{
			'No elements in the stack'
		}
	}
	
	String displayFullElements()
	{
		//container.each { print it }
		//println container
		if (!this.isStackEmpty())
		{
			def elements = container.flatten().findAll {it > 0}.join(', ')
			'[' + elements + ']  (--> order)'
		}
		else
		{
			'No Elements in the stack'
		}
	}
}
