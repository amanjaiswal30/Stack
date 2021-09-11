package stack;

public interface Stack
{
	int getSize();

	boolean isEmpty();

	boolean isFull();

	void push (int data);

	void pop();

	int peek();

	void printStack();
}
