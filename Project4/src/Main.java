
public class Main {

	public static void main(String[] args) {
	Person ceo= new Person("Brandon Jordan", 24, "4045555555", "730 Peachtree St");
	System.out.println("CEO's name is " + ceo.GetName());
	System.out.println("CEO's age is " + ceo.GetAge());
	System.out.println("CEO's phone number is " + ceo.GetPhoneNumber());
	System.out.println("CEO's address is " + ceo.GetAddress());
	System.out.println("It is October 8, 2015 today");
	ceo.GrowsOlder();
	System.out.println("CEO's age is now " + ceo.GetAge());
	}

}
