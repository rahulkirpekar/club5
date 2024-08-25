package exceptiontopic.unchecked;

// 1) checked Exception
//public class InvalidAgeException extends Exception



// 2) Unchecked Exception
public class InvalidAgeException extends RuntimeException
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}
