package application;

import entity.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();

        System.out.print("Enter account holder: ");
        String nome = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        String escolha = sc.nextLine();

        if (escolha.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double valor = sc.nextDouble();
            conta = new Conta(numeroConta, nome, valor);
        } else {
            conta = new Conta(numeroConta, nome);
        }

        System.out.println();

        System.out.println("Account data:");
        System.out.println(conta.toString());


        sc.close();
    }
}
