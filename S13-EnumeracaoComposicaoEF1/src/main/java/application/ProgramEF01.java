package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramEF01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter cliente data:");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1);

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");

		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());

		Order order = new Order(orderStatus, client);

		System.out.print("How many items to this order? ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Enter #" + (i + 1) + " item data: ");
			sc.nextLine();

			System.out.print("Product name: ");
			String productName = sc.nextLine();

			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();

			System.out.print("Quantity: ");
			int productQtd = sc.nextInt();

			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQtd, productPrice, product);
			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println(order);

		sc.close();
	}

}
