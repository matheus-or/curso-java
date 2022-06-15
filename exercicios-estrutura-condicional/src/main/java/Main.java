import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Exercício 1
//		Scanner sc = new Scanner(System.in);
//		
//		int numeroInteiro = sc.nextInt();
//		
//		if (numeroInteiro >= 0) {
//			System.out.println("NAO NEGATIVO");
//		} else {
//			System.out.println("NEGATIVO");
//		}
//		
//		sc.close();

		// Exercício 2
//		Scanner sc = new Scanner(System.in);
//
//		int numeroInteiro = sc.nextInt();
//
//		if (numeroInteiro % 2 == 0) {
//			System.out.println("PAR");
//		} else {
//			System.out.println("IMPAR");
//		}
//
//		sc.close();

		// Exercício 3
//		Scanner sc = new Scanner(System.in);
//
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//
//		if (A > B) {
//
//			if (A % B == 0) {
//				System.out.println("Sao Multiplos");
//			} else {
//				System.out.println("Nao sao Multiplos");
//			}
//
//		} else {
//
//			if (B % A == 0) {
//				System.out.println("Sao Multiplos");
//			} else {
//				System.out.println("Nao sao Multiplos");
//			}
//
//		}
//
//		sc.close();

		// Exercício 4
//		Scanner sc = new Scanner(System.in);
//
//		int hora1 = sc.nextInt();
//		int hora2 = sc.nextInt();
//		int duracao;
//
//		if (hora1 < hora2) {
//			duracao = hora2 - hora1;
//		} else {
//			duracao = 24 - hora1 + hora2;
//		}
//
//		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
//
//		sc.close();

		// Exercício 5
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		int item = sc.nextInt();
//		int qtd = sc.nextInt();
//		double total = 0;
//
//		if (item == 1) {
//			total = qtd * 4.00;
//		} else if (item == 2) {
//			total = qtd * 4.50;
//		} else if (item == 3) {
//			total = qtd * 5.00;
//		} else if (item == 4) {
//			total = qtd * 2.00;
//		} else if (item == 5) {
//			total = qtd * 1.50;
//		}
//
//		System.out.printf("Total: R$ %.2f%n", total);
//
//		sc.close();

		// Exercício 6
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		double numero = sc.nextDouble();
//
//		if (numero >= 0 && numero <= 25) {
//			System.out.println("Intervalo [0,25]");
//		} else if (numero > 25 && numero < 50) {
//			System.out.println("Intervalo (25,50]");
//		} else if (numero >= 75 && numero <= 100) {
//			System.out.println("Intervalo (75,100]");
//		} else if (numero < 0 || numero > 100) {
//			System.out.println("Fora de intervalo");
//		}
//
//		sc.close();

		// Exercício 7
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//
//		double x = 0;
//		double y = 0;
//
//		x = sc.nextDouble();
//		y = sc.nextDouble();
//
//		if (x == 0.0 && y == 0.0) {
//			System.out.println("Origem");
//		} else if (x == 0.0) {
//			System.out.println("Eixo Y");
//		} else if (y == 0.0) {
//			System.out.println("Eixo X");
//		} else if (x > 0 && y > 0) {
//			System.out.println("Q1");
//		} else if (x < 0 && y > 0) {
//			System.out.println("Q2");
//		} else if (x < 0 && y < 0) {
//			System.out.println("Q3");
//		} else if (x > 0 && y < 0) {
//			System.out.println("Q4");
//		}
//
//		sc.close();

		// Exercício 8
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();

		if (salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario > 2000.01 && salario <= 3000.00) {
			double p1 = (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f%n", p1);
		} else if (salario > 3000.01 && salario <= 4500.00) {
			double p1 = 1000.00 * 0.08;
			double p2 = (salario - 3000.00) * 0.18;
			System.out.printf("R$ %.2f%n", (p1 + p2));
		} else if (salario > 4500.00) {
			double p1 = 1000.00 * 0.08;
			double p2 = 1500.00 * 0.18;
			double p3 = (salario - 4500.00) * 0.28;
			System.out.printf("R$ %.2f%n", (p1 + p2 + p3));
		}

		sc.close();

	}

}
