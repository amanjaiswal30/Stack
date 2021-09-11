package stack.standardProblems;

import utility.ConversionsUtility;

import java.util.Stack;

public class InfixToPostFix extends ConversionsUtility
{
	public int precedence(char operationSymbol)
	{
		return super.precedence(operationSymbol);
	}

	public String infixToPostFixConversion(String infixExpression)
	{
		StringBuilder postfixExpression = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < infixExpression.length(); i++)
		{
			char character = infixExpression.charAt(i);
			if (Character.isLetterOrDigit(character))
			{
				postfixExpression.append(character);
			}
			else if (character == '(')
			{
				stack.push(character);
			}
			else if (character == ')')
			{
				while (!stack.isEmpty() && stack.peek() != '(')
				{
					postfixExpression.append(stack.pop());
				}
				stack.pop();
			}
			else
			{
				while (!stack.isEmpty() && precedence(character) < precedence(stack.peek()))
				{
					postfixExpression.append(stack.pop());
				}
				stack.push(character);
			}
		}
		while (!stack.isEmpty())
		{
			if (stack.peek() == '(')
			{
				return "Invalid Expression";
			}
			else
			{
				postfixExpression.append(stack.pop());
			}
		}
		return postfixExpression.toString();
	}
}
