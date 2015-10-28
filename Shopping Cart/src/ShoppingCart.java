import java.util.Scanner;

import java.util.*;

public class ShoppingCart
{
	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Shopping Cart!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to input item/s - y/n?");
		String answer = sc.nextLine();
		Answer(answer);
		sc.close();
		ArrayList itemPrice = new ArrayList();
	}
	
	public static void Answer(String answer)
	{
		if (answer != null)
		{
			if (!answer.isEmpty())
			{
				if (answer.equalsIgnoreCase("y"))
				{
					System.out.println("Thank You!");
				}
				else
				{
					if (answer.equalsIgnoreCase("n"))
					{
						System.out.println("Then why are you here?");
					}
					else
					{
						System.out.println("Invalid entry");
					}
				}
			}
		}
	}
	
	}
