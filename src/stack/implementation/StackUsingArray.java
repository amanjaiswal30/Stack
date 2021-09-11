package stack.implementation;

import stack.Stack;

public class StackUsingArray implements Stack
{
	private final int MAX_LENGTH;
	private int top;
	private final int[] array;

	public StackUsingArray(int MAX_LENGTH)
	{
		this.MAX_LENGTH = MAX_LENGTH;
		this.top = -1;
		this.array = new int[MAX_LENGTH];
	}

	public int getSize()
	{
		if (this.top != -1)
		{
			return top + 1;
		}
		return 0;
	}

	public boolean isFull()
	{
		return this.top == this.MAX_LENGTH - 1;
	}

	public boolean isEmpty()
	{
		return this.getSize() == 0;
	}

	public void push(int number)
	{
		if (!this.isFull())
		{
			this.array[++this.top] = number;
		}
	}

	public void pop()
	{
		if (!this.isEmpty())
		{
			this.top--;
		}
	}

	public int peek()
	{
		if (!this.isEmpty())
		{
			return this.array[this.top];
		}
		return 0;
	}

	public void printStack()
	{
		if (!this.isEmpty())
		{
			for (int i = 0; i <= top; i++)
			{
				System.out.print(this.array[i] + "->");
			}
		}
	}
}
