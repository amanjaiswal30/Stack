package utility;

public class ConversionsUtility
{
	public int precedence(char operationSymbol)
	{
		switch (operationSymbol)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			default:
				return -1;
		}
	}
}
