package Demo;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Enter your middle name:");
        String middleName = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

  //      System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.format("My full name is: %s %s %s", firstName, middleName, lastName);
    }
}
