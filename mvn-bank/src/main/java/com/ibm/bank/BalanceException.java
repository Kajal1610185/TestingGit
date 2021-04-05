package com.ibm.bank;

public class BalanceException {

	public static void main(String[] args) {
		Account a1=new Account("Polo", 1000);
		a1.deposit(2000);
		a1.summary();
		try {
			a1.withdraw(5000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Savings s1= new Savings("mona");
		try {
			s1.withdraw(5);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
		//e.printStackTrace(); //for debugging/troubleshooting user: developer
		/*	System.out.println(e);*/ //for system/application audit: user: Loggers
			System.out.println(e.getMessage());//for end user
		} //insufficient balance
	}

}


}
