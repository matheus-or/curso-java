package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of product: ");
		int qtd = sc.nextInt();
		List<Product> productList = new ArrayList<>();

		for (int i = 0; i < qtd; i++) {

			System.out.println("Product #" + (i + 1) + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Price: ");
			Double price = sc.nextDouble();			

			if (type == 'i') {
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customFee);
				productList.add(product);
			} else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				Product product = new UsedProduct(name, price, sdf1.parse(manufactureDate));
				productList.add(product);
			} else {
				Product product = new Product(name, price);
				productList.add(product);
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : productList) {
			System.out.println(product.priceTag());
		}

		sc.close();
	}
}
