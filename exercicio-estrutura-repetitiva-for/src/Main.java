import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercicio resolvido 03

//		int N = sc.nextInt();
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i + " x " + N + " = " + i * N);
//		}

		// Exercicio resolvido 04

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//
//		int min, max;
//
//		if (x < y) {
//			min = x;
//			max = y;
//		} else {
//			min = y;
//			max = x;
//		}
//
//		int soma = 0;
//		for (int i = min + 1; i < max; i++) {
//			if (i % 2 != 0) {
//				soma = soma + i;
//			}
//
//		}
//		
//		System.out.println(soma);

		// Exercico proposto 1

//		int x = sc.nextInt();
//
//		for (int i = 1; i <= x; i++) {
//
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//
//		}

		// Exercicio proposto 2

//		int n = sc.nextInt();
//		int in = 0;
//		int out = 0;
//
//		for (int i = 0; i < n; i++) {
//			int x = sc.nextInt();
//			if (x >= 10 && x <= 20) {
//				in++;
//			} else {
//				out++;
//			}
//		}
//		
//		System.out.println(in + " in");
//		System.out.println(out + " out");

		// Exercicio proposto 3

//		int n = sc.nextInt();
//
//		for (int i = 0; i < n; i++) {
//
//			double nota1 = sc.nextDouble();
//			double nota2 = sc.nextDouble();
//			double nota3 = sc.nextDouble();
//
//			nota1 = nota1 * 0.20;
//			nota2 = nota2 * 0.30;
//			nota3 = nota3 * 0.50;
//
//			double soma = nota1 + nota2 + nota3;
//
//			System.out.printf("%.1f%n", soma);
//
//		}

		// Exercicio proposto 4

//		int n = sc.nextInt();
//
//		for (int i = 0; i < n; i++) {
//			int n1 = sc.nextInt();
//			int n2 = sc.nextInt();
//
//			if (n2 == 0) {
//				System.out.println("divisao impossivel");
//			} else {
//				System.out.printf("%.1f%n", (double)  n1 / n2);
//			}
//
//		}

		// Exercicio proposto 5

//		int n = sc.nextInt();
//		int soma = n;
//
//		if (n == 0) {
//			System.out.println(1);
//		} else {
//			for (int i = 1; i < n; i++) {
//
//				soma = soma * (n - i);
//
//			}
//			System.out.println(soma);
//		}

		// Resposta exercicio proposto 5
//		int n = sc.nextInt();
//
//		int fat = 1;
//		for (int i = 1; i <= n; i++) {
//			fat = fat * i;
//		}
//
//		System.out.println(fat);

		// Exercicio proposto 6

//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//			}
//
//		}

		// Exercicio proposto 7

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}

		sc.close();
	}

}
