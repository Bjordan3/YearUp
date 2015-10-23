import java.lang.reflect.Array;

public class LargestNumber 
{

	public static void main(String[] args) 
	{
		int[] num = {-1, 25, 33, 97, -4, -5, 87, 2334,88675,0,-24};
		int[] nums = {32,443,414,-14,90,-1444,94049,985,24,2784};
		LargestNumberUsingWhileLoop(num);
		LargestNumberUsingForLoop(nums);

	}
	public static void LargestNumberUsingWhileLoop(int[] numbers) 
	{
		if (numbers != null) 
		{
			if (numbers.length > 0) 
			{
				int i = 1;
				int LargestNumber = numbers[0];
				while (i < numbers.length) 
				{
					if 
					(
						LargestNumber < numbers[i]) 
					{
						LargestNumber = numbers[i];
					}
					i++;
				}
				System.out.println("The largest number using while loops is "
						+ LargestNumber);
			}
		}
	}
	public static void LargestNumberUsingForLoop(int[] numbers) 
	{
		if (numbers != null) 
		{
			if (numbers.length > 0) 
			{
				int i;
				int LargestNumber = numbers[0];
				for (i = 1; i < numbers.length; i++) 
				{
					if (LargestNumber < numbers[i]) 
					{
						LargestNumber = numbers[i];
					}

				}
				System.out.println("The largest number using for loops is "
						+ LargestNumber);
			}
		}
	}
}