package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double maior = 0.0;
        int posicao = 0;

        for (int i = 0; i < vect.length; i++) {

            if (maior < vect[i]) {
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao );

        sc.close();
    }
}
