import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercicio resolvido 1

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//
//		while (x != y) {
//
//			if (x < y) {
//				System.out.println("Crescente");
//			} else {
//				System.out.println("Decrescente");
//			}
//			
//			x = sc.nextInt();
//			y = sc.nextInt();
//
//		}

		// Exercicio resolvido 2

//		int idade = sc.nextInt();
//		int soma = 0;
//		int cont = 0;
//
//		while (idade >= 0) {
//			soma = soma + idade;
//			cont = cont + 1;
//			idade = sc.nextInt();
//		}
//
//		if (cont > 0) {
//			double media = (double) soma / cont;
//			System.out.printf("%.2f%n", media);
//		} else {
//			System.out.println("Impossivel calcular");
//		}

		// Exercicio 1

//		int senhaCorreta = 2002;
//		int senha = sc.nextInt();
//
//		while (senha != senhaCorreta) {
//			System.out.println("Senha Invalida");
//			senha = sc.nextInt();
//		}
//
//		System.out.println("Acesso Permitido");

		// Exercicio 2

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//
//		while (x != 0 && y != 0) {
//
//			if (x > 0 && y > 0) {
//				System.out.println("Primeiro");
//			} else if (x < 0 && y > 0) {
//				System.out.println("Segundo");
//			} else if (x < 0 && y < 0) {
//				System.out.println("Terceiro");
//			} else if (x > 0 && y < 0) {
//				System.out.println("Quarto");
//			}
//
//			x = sc.nextInt();
//			y = sc.nextInt();
//		}

		// Exercicio 3

		int tipo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (tipo != 4) {

			switch (tipo) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}
			
			tipo = sc.nextInt();

		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
