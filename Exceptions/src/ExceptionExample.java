import java.io.*;

public class ExceptionExample {

	public static void main(String[] args) throws IOException
	{
	
	try
	{
	DivideNumbers(5, 0);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("You can't divide by zero");
		ae.printStackTrace();
	}
	
	try
	{
		int[] numbers =  null;
		AddArray(numbers);
		FileWriter writer = new FileWriter("blah");
	}
	catch(ArrayIndexOutOfBoundsException ar)
	{
		System.out.println("I tried to access a location in an array that did not exist.");
		ar.printStackTrace();
	}
	}
	
	private static void AddArray(int[] numbers) throws NullPointerException
	{
		int sum = 0;
		
		if(numbers == null)
		{
			System.out.println("The input to add array was a null array");
			throw new NullPointerException();
		}
		
		for (int i = 0; i <= numbers.length; i++)
		{
			sum = sum + numbers[i];
		}
		System.out.println("Sum is: " + sum);
	}
	
	private static void DivideNumbers(int num, int nums) throws ArithmeticException
	{
		num = 5;
		nums = 0;
		int answer = num / nums;
		System.out.println(num / nums <= answer );
	}
}
