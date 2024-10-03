package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number os tax payers: ");
		int qtd = sc.nextInt();

		List<Pessoa> list = new ArrayList<>();

		for (int i = 1; i <= qtd; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String nome = sc.nextLine();

			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else {
				System.out.print("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}

		Double totalTaxes = 0.0;

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Pessoa pessoa : list) {
			System.out.println(String.format("%s: $ %.2f", pessoa.getNome(), pessoa.valorImpostoPago()));
			totalTaxes += pessoa.valorImpostoPago();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

		sc.close();
	}
}
