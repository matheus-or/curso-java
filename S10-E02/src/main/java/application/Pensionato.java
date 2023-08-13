package application;

import br.com.matheus.model.Hospede;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hospede[] vect = new Hospede[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.println("Rent #" + (i + 1));
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int room = sc.nextInt();

            vect[room] = new Hospede(name, email);

            System.out.println();
        }

        System.out.println("Busy rooms:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i +": " + vect[i]);
            }
        }

        sc.close();
    }
}
