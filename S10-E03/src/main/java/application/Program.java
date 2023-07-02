package application;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int qtd = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {

            Employee employee = new Employee();

            System.out.println();

            System.out.println("Emplyoee #" + (i + 1) + ":");

            System.out.print("Id: ");

            int id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.print("ID do Emplyoee já existe, entre com um id novamente: ");
                id = sc.nextInt();
            }

            employee.setId(id);

            sc.nextLine();

            System.out.print("Name: ");
            employee.setName(sc.nextLine());

            System.out.print("Salary: ");
            employee.setSalary(sc.nextDouble());

            System.out.println();

            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee employee = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);

        if (employee != null) {

            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();

            employee.increaseSalary(percent);

            System.out.println();

        } else {
            System.out.println("This id does not exist!");
            System.out.println();
        }

        System.out.println("List of employees:");
        for (Employee employee1 : list) {
            System.out.println(employee1.toString());
        }

        sc.close();
    }

    private static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        return employee != null;
    }

}
