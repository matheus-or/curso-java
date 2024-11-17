package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.expection.WithdrawException;

public class ProgramEF1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();

			System.out.println();
			
			Account account = new Account(number, holder, balance, limit);

			System.out.print("Enter amount for withdraw: ");
			
			account.withdraw(sc.nextDouble());
			
			System.out.printf("New balance: %.2f", account.getBalance());
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}