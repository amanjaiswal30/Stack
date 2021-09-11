package stack.standardProblems;

import java.util.Stack;

public class postfixToInfix
{
	public String postfixToInfixConversion(String expression)
	{
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++)
		{
			if (Character.isLetterOrDigit(expression.charAt(i)))
			{
				stack.push(Character.toString(expression.charAt(i)));
			}
			else
			{
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				String operation = "(" + operand1 + expression.charAt(i) + operand2 + ")";
				stack.push(operation);
			}
		}
		return stack.pop();
	}
}
