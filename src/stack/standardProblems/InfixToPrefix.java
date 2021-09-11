package stack.standardProblems;

import utility.ConversionsUtility;

public class InfixToPrefix extends ConversionsUtility
{
	InfixToPostFix infixToPostFixObject = new InfixToPostFix();

	public int precedence(char operationSymbol)
	{
		return super.precedence(operationSymbol);
	}

	public String reverse(String expression)
	{
		StringBuilder originalString = new StringBuilder(expression);
		String reversedString = originalString.reverse().toString();
		// reverse all '(' to ')' and vice versa.
		reversedString = reversedString.replace('(', '%');
		reversedString = reversedString.replace(')', '(');
		reversedString = reversedString.replace('%', ')');
		return reversedString;
	}

	public String infixToPrefix(String expression)
	{
		String reversedString = this.reverse(expression);
		reversedString = '(' + reversedString + ')';
		StringBuilder prefixExpression = new StringBuilder();
		prefixExpression.append(this.infixToPostFixObject.infixToPostFixConversion(reversedString));
		return prefixExpression.reverse().toString();
	}
}
