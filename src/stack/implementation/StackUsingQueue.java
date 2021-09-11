package stack.implementation;

import stack.Stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue implements Stack
{
	private Queue<Integer> mainQueue;
	private Queue<Integer> referenceQueue;

	public StackUsingQueue()
	{
		this.mainQueue = new LinkedList<>();
		this.referenceQueue = new LinkedList<>();
	}

	public boolean isEmpty()
	{
		return this.mainQueue.isEmpty();
	}

	public boolean isFull()
	{
		return false;
	}

	public void push(int data)
	{
		this.referenceQueue.add(data);
		while (!this.mainQueue.isEmpty())
		{
			this.referenceQueue.add(this.mainQueue.peek());
			this.mainQueue.remove();
		}
		Queue<Integer> tempQueue = this.mainQueue;
		this.mainQueue = this.referenceQueue;
		this.referenceQueue = tempQueue;
	}

	public void pop()
	{
		if (!this.mainQueue.isEmpty())
		{
			this.mainQueue.remove();
		}
	}

	public int getSize()
	{
		return this.mainQueue.size();
	}

	public int peek()
	{
		if (!this.mainQueue.isEmpty())
		{
			return this.mainQueue.peek();
		}
		return 0;
	}

	public void printStack()
	{
		if (!this.mainQueue.isEmpty())
		{
			Iterator iterator = this.mainQueue.iterator();
			do
			{
				System.out.print(iterator.next() + "->");
			} while (iterator.hasNext());
		}
	}
}
