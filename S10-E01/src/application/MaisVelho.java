package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int qtdNumeros = sc.nextInt();

        Pessoa[] vect = new Pessoa[qtdNumeros];

        for (int i = 0; i < vect.length; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);

            vect[i] = pessoa;
        }

        Pessoa pessoaMaisVelha = new Pessoa("", 0);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() > pessoaMaisVelha.getIdade()) {
                pessoaMaisVelha = vect[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " +  pessoaMaisVelha.getNome());

        sc.close();
    }
}
