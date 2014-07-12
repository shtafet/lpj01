
public class TestTax {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tax t = new Tax();
		NJTax t = new NJTax();
		
		t.grossIncome=50000;
		t.numberOfDependents=2;
		t.state="NJ";
		
		/*t.grossIncome= Double.parseDouble(args[0]);
		t.numberOfDependents= Integer.parseInt(args[1]);
		t.state= args[2];*/
		
		
		double yourTax = t.calcTax();
		
		System.out.println("Your tax is " + t.adjustForStudents(yourTax));

	}

}
