package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramExeProposto {

	public static void main(String[] args) {

		// test: c:\temp\source.csv
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> products = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File path = new File(sourceFileStr);
		String parent = path.getParent();

		boolean success = new File(parent + "\\out").mkdir();
		System.out.println("Folder created: " + success);

		String outPath = parent + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2])));
				line = br.readLine();
			}

			for (Product product : products) {
				bw.write(product.getDescription());
				bw.newLine();
			}
			
			System.out.println(outPath + " CREATED");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
