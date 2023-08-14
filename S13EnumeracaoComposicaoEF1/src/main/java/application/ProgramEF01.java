package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramEF01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String dataNascimento = sc.nextLine();

		System.out.println("Enter order data:");
		

		sc.close();
	}

}
