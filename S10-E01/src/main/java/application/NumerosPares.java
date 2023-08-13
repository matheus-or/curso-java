package application;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        int qtdPares = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");

            int nu = sc.nextInt();

            if ((nu % 2) == 0) {
                qtdPares++;
            }

            vect[i] = nu;
        }

        System.out.println("NÚMEROS PARES:");

        for (int i = 0; i < vect.length; i++) {
            if ((vect[i] % 2) == 0) {
                System.out.print(vect[i] + " ");
            }
        }

        System.out.println("QUANTIDADE DE PARES = " + qtdPares);

        sc.close();
    }
}
