package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdNumeros = sc.nextInt();

        double[] vect = new double[qtdNumeros];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.printf(" %.2f", vect[i]);
        }

        System.out.println();

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        System.out.printf("SOMA = %.2f%n", sum);

        double avg = sum / vect.length;

        System.out.printf("MEDIA = %.2f%n", avg);


        sc.close();
    }
}
