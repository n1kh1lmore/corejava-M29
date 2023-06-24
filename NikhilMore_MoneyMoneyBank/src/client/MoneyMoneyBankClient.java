package client;


import application.MMBankFactory;
import application.MMCurrentAcc;
import application.MMSavingAcc;
import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class MoneyMoneyBankClient {

	public static void main(String[] args) {
		BankFactory b = new MMBankFactory();
		SavingAcc s = new MMSavingAcc(1111, "Nikhil More", 3000, true);
		CurrentAcc c = new MMCurrentAcc(2222, "Niket Kamble", 5000, 4500);
		
		System.out.println(s);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println("Saving Account");
		
		s.withdraw(200);
		
		
		System.out.println("\nCurrent Account");
		c.withdraw(400);
		
		
	}

}
