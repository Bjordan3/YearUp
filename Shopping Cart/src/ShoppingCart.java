import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Product> item = new ArrayList<Product>();
	static double Total = 0;

	public static <Product> void main(String[] args) {

		Intro();
		Shopping();

	}

	public static void Intro() {
		System.out.println("Welcome to the Shopping Cart!!\n" + "\n"
				+ "*********************************\n"
				+ "*                               *\n"
				+ "*         Shopping Cart         *\n"
				+ "*                               *\n"
				+ "*********************************");
	}

	public static void Shopping() {

		System.out.println("Do you want to input items? Type y/n");
		String reply = s.nextLine();
		if (reply.equalsIgnoreCase("y")) {
			Read();
			Clean();
			Total();
			Taxed(Total);

		} else {

			System.out.println("GoodBye!");
		}

	}

	public static void Read() {
		System.out.println("Enter item name or Q to quit: ");
		String Name = s.next();
		while (!Name.equalsIgnoreCase("q")) {
			System.out.println("Enter item price: ");
			double Price = s.nextDouble();
			s.nextLine();
			Product newItem = new Product(Name, Price);
			item.add(newItem);
			System.out.println("Enter next item name or Q to quit: ");
			Name = s.next();
			s.nextLine();
	//Read method to read input items, create new products,
	//and add their name and price to the Item Array until Q is entered.
		}
	}

	private static void listProducts() {
		for (int i = 0; i < item.size(); i++) {
			Product current = item.get(i);
			System.out.println(
					"Item number: " + (i + 1) + " Item name: " + current.getName()
							+ " Item Price: $" + current.getPrice());
			//listProducts method using a for loop to list the Product objects
			//stored in the Item Array.
		}
		System.out.println("\n");
	}

	public static void Clean() {
		listProducts();
		System.out.println(
				"Would you like to remove an item from the cart? y/n:");
		String in = s.nextLine();
		if (in.equalsIgnoreCase("y")) {
			System.out.println(
					"Enter the number of the item you want to remove, or -1 to quit: ");
			int indexRead = s.nextInt();

			int indexOfItem = indexRead - 1;
			while (indexRead != -1) {
				Product Remove = item.get(indexOfItem);
				if (Remove != null) {
					item.remove(indexOfItem);
					System.out.println("You have removed " + Remove.getName());
					listProducts();
				}
				System.out.println("Enter another item number, or -1 to quit:");
				indexRead = s.nextInt();
				// Clean method lists items then asks if the customer wants to
				//remove any items. Finally if the customer removes an item
				//the method lists the items minus the remove item until -1
				//is entered.
			}
		}
	}

	private static void Total() {
		double price = 0;

		int i = 0;
		while (i < item.size()) {

			for (i = 0; i < item.size(); i++) {
				Product CP = item.get(i);
				price = price + CP.getPrice();
			}
			System.out.println("The total Price is $" + price);

		}
		Total = price;
		//Total method using a while loop to retrieve each item and add
		//each item price together and output the total amount.
	}

	public static double Taxed(double total) {

		double TWT = total + (total * .075);

		System.out.println("Your price with tax is $" + TWT + "\n");
		if (TWT >= 100) {
			System.out.println(
					"Your total is above $100. You have to pay with card.");
		} else if (TWT < 100) {
			System.out.println(
					"You purchase is below $100 would you like to continue to shop? y/n");
			String re = s.nextLine();
			if (!re.equalsIgnoreCase("n")) {
				Shopping();
			}

		}

		System.out.println("Thank you for shopping! You paid $" + TWT);
		return TWT;
		//The method Taxed checks if the taxWithTotal is greater than 100. If
		//it is then the customer must pay with credit. If not it asks if they
		//would like to continue shopping. Once done the customer is given
		//their taxWithTotal.

	}

}