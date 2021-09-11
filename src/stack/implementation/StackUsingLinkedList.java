package stack.implementation;

import stack.Stack;

public class StackUsingLinkedList implements Stack
{

	private static class Node
	{
		int data;
		Node next;

		private Node(int data)
		{
			this.data = data;
		}
	}

	private Node top;
	private int size;

	public StackUsingLinkedList()
	{
		this.top = null;
		this.size = 0;
	}

	public int getSize()
	{
		return this.size;
	}

	public boolean isEmpty()
	{
		return this.getSize() == 0;
	}

	public boolean isFull()
	{
		return false;
	}

	public void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next = this.top;
		this.top = newNode;
		this.size++;
	}

	public void pop()
	{
		if (!this.isEmpty())
		{
			this.top = this.top.next;
			this.size--;
		}
	}

	public int peek()
	{
		if (!this.isEmpty())
		{
			return this.top.data;
		}
		return 0;
	}

	public void printStack()
	{
		if (!this.isEmpty())
		{
			Node currentNode = this.top;
			while (this.top.next != null)
			{
				System.out.print(currentNode.data + "->");
				currentNode = currentNode.next;
			}
		}
	}
}
