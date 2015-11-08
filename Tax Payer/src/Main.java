
public class Main {

	public static void main(String[] args) 
	{
		Banker Dimon = new Banker(1000000);
		Dimon.Paytaxes(.35);
		
		Scientist Nye = new Scientist(120000);
		Nye.Paytaxes(.20);
		
		Dimon.FileTaxReturn();
		Nye.FileTaxReturn();
		
		TaxAuditor craig = new TaxAuditor();
		craig.Audit(Dimon);
		craig.Audit(Nye);
	}

}
