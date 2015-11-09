
public class Programmer implements ITaxPayer 
{
	private double m_income = -1;
	private boolean m_donePayingTaxes = false;
	
	Programmer(double income)
	{
		SetIncome(income);
	}
	public double GetIncome()
	{
		return m_income;
	}
	private void SetIncome(double income)
	{
		m_income = income;
	}
	
	public void Paytaxes(double taxRate) 
	{
		if (m_donePayingTaxes == false)
		{
			double taxAmount = GetIncome() * taxRate;
			System.out.println("Programmer is paying the following as tax: " + taxAmount);
			SetIncome(GetIncome() - taxAmount);
			System.out.println("Programmer income after paying taxes is: " + GetIncome());
			m_donePayingTaxes = true;
		}
		
	}


	public void FileTaxReturn() 
	{
		System.out.println("Programmer is filing his tax return");
	}

}
