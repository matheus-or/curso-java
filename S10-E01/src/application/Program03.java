package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdNumeros = sc.nextInt();

        Pessoa[] vect = new Pessoa[qtdNumeros];

        for (int i = 0; i < vect.length; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa(nome, idade, altura);

            vect[i] = pessoa;
        }

        double sum = 0.0;
        double qtdMenor = 0;


        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                qtdMenor++;
            }
        }

        double avg = sum / vect.length;

        System.out.printf("Altura média = %.2f%n", avg);

        double porcentagemMenor =  ((qtdMenor * 100) / vect.length);

        String texto = String.format("Pessoas com menos de 16 anos: %.1f", porcentagemMenor);

        System.out.println(texto + "%");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
