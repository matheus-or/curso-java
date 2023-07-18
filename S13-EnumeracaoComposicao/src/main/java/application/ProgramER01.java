package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramER01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		Department department = new Department(departmentName);

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Level: ");
		String level = sc.nextLine();

		System.out.print("Base salary: ");
		double salary = sc.nextDouble();

		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, department);

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");
			sc.nextLine();

			System.out.print("Date (DD/MM/YYYY): ");
			String data = sc.nextLine();

			LocalDate localDate = LocalDate.parse(data, fmt1);

			System.out.print("Value per hour: ");
			Double valor = sc.nextDouble();

			System.out.print("Duration (hours): ");
			int duracao = sc.nextInt();

			HourContract contract = new HourContract(localDate, valor, duracao);
			worker.addContract(contract);
		}

		System.out.println();
		sc.nextLine();

		System.out.print("Enter month ans year to calculate income (MM/YYYY): ");
		String income = sc.nextLine();
		LocalDate dateIncome = LocalDate.parse("05/"+income, fmt1);

		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf(
				"Income for %s: %.2f%n",income , worker.income(dateIncome.getYear(), dateIncome.getMonthValue()));

		sc.close();
	}

}
