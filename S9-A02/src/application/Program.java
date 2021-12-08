package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Preço: ");
        double price = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Entre com o número de produtos para adicionar ao estoque: ");
        product.addProduct(sc.nextInt());

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Entre com o número de produtos para retirar do estoque: ");
        product.removeProduct(sc.nextInt());

        System.out.println("Updated data: " + product);

        sc.close();
    }

}
