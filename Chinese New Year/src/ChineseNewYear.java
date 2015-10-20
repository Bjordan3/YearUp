import java.util.Scanner;
public class ChineseNewYear {

	public static void main(String[] args) {
		
		
		Scanner y = new Scanner(System.in);
		System.out.println("Enter the year you were born:\n");
		int year = y.nextInt();
		EvaluateChineseYear(year);

	}

	public static void EvaluateChineseYear(int year) {
	
		
		int yearDifference = year -1900;
		int remainder = yearDifference %12;
		
		switch(remainder){
			case 0:
				System.out.println("You are the year of the rat");
				break;
			case 1:
				System.out.println("you are the year of the ox");
				break;
			case 2:
				System.out.println("You are the year of the tiger");
				break;
			case 3:
				System.out.println("You are the year of the rabbit");
				break;
			case 4:
				System.out.println("You are the year of the dragon");
				break;
			case 5:
				System.out.println("You are the year of the snake");
				break;
			case 6:
				System.out.println("You are the year of the horse");
				break;
			case 7:
				System.out.println("You are the year of the sheep");
				break;
			case 8:
				System.out.println("You are the year of the monkey");
				break;
			case 9:
				System.out.println("You are the year of the rooster");
				break;
			case 10:
				System.out.println("You are the year of the dog");
				break;
			case 11:
				System.out.println("You are the year of the pig");
				break;
		}
		
		
	}

}
