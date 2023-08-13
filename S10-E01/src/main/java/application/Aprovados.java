package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Aluno[] vect = new Aluno[n];

        for (int i = 0; i < vect.length; i++) {

            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();
            double primeira = sc.nextDouble();
            double segunda = sc.nextDouble();

            Aluno aluno = new Aluno(nome, primeira, segunda);

            vect[i] = aluno;
        }

        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < vect.length; i++) {
            if (((vect[i].getPrimeiraNota() + vect[i].getSegundaNota()) / 2) >= 6.0) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }

}
