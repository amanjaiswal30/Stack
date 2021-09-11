package stack.standardProblems;

import java.util.Stack;

public class PrefixToInfix
{
	public String prefixToInfixConversion(String prefixExpression)
	{
		Stack<String> stack = new Stack<>();
		for (int i = prefixExpression.length() - 1; i >= 0; i--)
		//for postfix to prefix read expression from left to right
		{
			char character = prefixExpression.charAt(i);
			if (!Character.isLetterOrDigit(character))
			{
				String operand1 = stack.pop();
				String operand2 = stack.pop();
				String operation = "(" + operand1 + character + operand2 + ")";
				// for prefix to postfix operation formation will be operand1 + operand2+ character
				stack.push(operation);
			}
			else
			{
				stack.push(Character.toString(character));
			}
		}
		return stack.pop();
	}
}
