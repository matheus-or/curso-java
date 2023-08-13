package application;

import entities.Aluno;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitados? ");
        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {

            System.out.print("Altura da  " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.print("Genero da  " + (i + 1) + "a pessoa: ");
            String genero = sc.nextLine();

            Pessoa pessoa = new Pessoa(altura, genero);

            vect[i] = pessoa;
        }

        double menor = vect[0].getAltura();
        double maior = 0.0;

        double sum = 0.0;
        int qtdMulheres = 0;

        int qtdHomens = 0;


        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getAltura() > maior) {
                maior = vect[i].getAltura();
            }

            if (vect[i].getAltura() < menor) {
                menor = vect[i].getAltura();
            }

            if (vect[i].getGenero().equalsIgnoreCase("M")) {
                qtdHomens++;
            } else {
                sum += vect[i].getAltura();
                qtdMulheres++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menor);
        System.out.printf("Maior altura = %.2f%n", maior);

        double avg = sum/qtdMulheres;

        System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
        System.out.print("Numero de homens = " + qtdHomens);

        sc.close();
    }
}
