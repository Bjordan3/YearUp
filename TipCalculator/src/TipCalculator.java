import java.util.Scanner;

public class TipCalculator {
private static Scanner Tip;
	public static void main(String[] args) {
		
		Tip = new Scanner(System.in);
		System.out.println("What is bill amount?: ");
		double amt;
		amt = Tip.nextFloat();
		double tenPercent = TenPercent(amt);
		double fifteenPercent = FifteenPercent(amt);
		double twentyPercent = TwentyPercent(amt);
		
		System.out.format("Tips are equal to: 10 percent is "+ tenPercent
				+ " 15 percent "+ fifteenPercent + " and 20 percent "+ twentyPercent + ".");
	}
	public static double TenPercent(double amt) {

		double TenPercent = (amt * .1);
		return TenPercent;
	}
	public static double FifteenPercent(double amt) {

		double fifteenPercent = (amt * .15);
		return fifteenPercent;
	}
	public static double TwentyPercent(double amt) {

		double TwentyPercent = (amt * .20);
		return TwentyPercent;
	}
}
