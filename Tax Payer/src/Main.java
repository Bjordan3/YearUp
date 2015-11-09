
public class Main {

	public static void main(String[] args) 
	{
		Banker Dimon = new Banker(1000000);
		Dimon.Paytaxes(.35);
		
		Scientist Nye = new Scientist(120000);
		Nye.Paytaxes(.20);
		
		Programmer Brandon = new Programmer(2000000);
		Brandon.Paytaxes(.15);
		
		Dimon.FileTaxReturn();
		Nye.FileTaxReturn();
		Brandon.FileTaxReturn();
		
		TaxAuditor craig = new TaxAuditor();
		craig.Audit(Dimon);
		craig.Audit(Nye);
		craig.Audit(Brandon);
	}

}
