
public class Thief {

	public static void main(String[] args) 
	{
		Account savingsAccount = new Account(123, "Savings", 456);
		System.out.println("The admin is setting amount to 500 dollars");
		savingsAccount.UpdateAmountSecurely(500, "admin");
		System.out.println("Amount in account id " + savingsAccount.m_accountId + " is " + savingsAccount.GetAmount());
		System.out.println("The thief is setting amount to 0 dollars");
		savingsAccount.UpdateAmountSecurely(0, null);
		System.out.println("Amount in account id " + savingsAccount.m_accountId + " is " + savingsAccount.GetAmount());
	}

}
