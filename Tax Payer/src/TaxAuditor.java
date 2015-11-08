
public class TaxAuditor
{
	public void Audit(ITaxPayer taxPayer)
	{
		System.out.println("Tax auditor is now auditing " + taxPayer.getClass());
	}
}
