import java.util.*;

public class Payroll {
	private String m_employeeName = "";
	private static double m_salary = 0;
	private static double m_taxPercentage = 0;
	private static double m_benefits = 0;
	private static double m_payCheck = 0;
	
public static void main(String[] args) 
{
	CreatePayCheck();
}

public static void CreatePayCheck()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name:");
	String employeeName = sc.nextLine();
	System.out.println("Enter Salary:");
	double salary = sc.nextDouble();
	System.out.println("Enter Tax Percentage:");
	double taxPercentage = sc.nextDouble();
	System.out.println("Enter benefits amount:");
	double benefits = sc.nextDouble();
	double payCheck = salary - (salary * taxPercentage + benefits);
	System.out.println(employeeName + " Your paycheck amount is " + payCheck);
	// Method to use user input variables in order to create and display the paycheck object //
}

public void setEmployeeName(String employeeName)
{
	m_employeeName = employeeName;
	// Sets the variable for the employee name //
}

public void setSalary(double salary)
{
	m_salary = salary;
	// Sets the variable for the salary //
}

public void setTaxPercentage(double taxPercentage)
{
	m_taxPercentage = taxPercentage;
	// Sets the variable for tax percentage //
}

public void setBenefits(double benefits)
{
	m_benefits = benefits;
	// Sets the variable for benefits //
}

public void setPayCheck(double payCheck)
{
	m_payCheck = payCheck;
	// Sets the variable for pay check //
}

public String getEmployeeName()
{
	return m_employeeName;
	// Returns the employee name //
}

public static double getSalary()
{
	return m_salary;
	// Returns the salary //
}

public static double getTaxPercentage()
{
	return m_taxPercentage;
	// Returns tax percentage //
}

public static double getBenefits()
{
	return m_benefits;
	// Returns benefits amount //
}

public static double getPayCheck()
{
	return m_payCheck;
	// Returns pay check amount //
}

}

