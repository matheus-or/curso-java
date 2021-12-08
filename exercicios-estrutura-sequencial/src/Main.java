import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//EXEMPLO Exercício resolvido 1
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double largura = sc.nextDouble();
//		double comprimento = sc.nextDouble();
//		double metroQuadrado = sc.nextDouble();
//		
//		double area = largura * comprimento;
//		double preco = area * metroQuadrado;
//		
//		System.out.printf("AREA = %.2f%n", area);
//		System.out.printf("PRECO = %.2f%n", preco);
//		
//		sc.close();
		
		//Exercício 1
		
//		Scanner sc = new Scanner(System.in);
//		
//		int v1 = sc.nextInt();
//		int v2 = sc.nextInt();
//		int soma = v1 + v2;
//		
//		System.out.println("SOMA = " + soma);
//		
//		sc.close();
		
		//Exercício 2
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		double raio = sc.nextDouble();
//		double pi = 3.14159;
//		double area = pi * Math.pow(raio, 2);
//		
//		System.out.printf("A=%.4f", area);
//		
//		sc.close();
		
		//Exercício 3
		
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int C = sc.nextInt();
//		int D = sc.nextInt();
//		int diferenca = A * B - C * D;
//		
//		System.out.println("DIFERENCA = " + diferenca);
//		
//		sc.close();
		
		//Exercício 4
		
//		Locale.setDefault(Locale.US);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int nFunc = sc.nextInt();
//		int horas = sc.nextInt();
//		double valor = sc.nextDouble();
//		double salario = horas * valor;
//		
//		System.out.println("NUMBER = " + nFunc);
//		System.out.printf("SALARY = U$ %.2f", salario);
//		
//		sc.close();
		
		//Exercício 5
		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		int codigoPecaUm = sc.nextInt();
//		int numeroPecaUm = sc.nextInt();
//		double valorPecaUm = sc.nextDouble();
//		int codigoPecaDois = sc.nextInt();
//		int numeroPecaDois = sc.nextInt();
//		double valorPecaDois = sc.nextDouble();		
//		
//		double valor = (numeroPecaUm * valorPecaUm) + (numeroPecaDois * valorPecaDois);
//		
//		System.out.printf("VALOR A PAGAR: R$ %.2f ", valor);
//		
//		sc.close();
		
		//Exercício 6
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;
		
		double areaTrianguloRetangulo = (a * c) / 2;
		double areaCirculo = pi * Math.pow(c, 2);
		double areaTrapezio = ((a + b) * c)/2;
		double areaQuadrado = Math.pow(b, 2);
		double areaRetangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
