
public class Main {
	
	public static void main(String[] args){
		
		Loan oda = new Loan(5, 15, 20000);
		
		System.out.println("Yearly: " + oda.totalPayment());
		
		System.out.println("Monthly: " + oda.monthlyPayment());
		

		
	}

}
