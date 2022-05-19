package Demo;

import java.util.Scanner;

public class Surface {
    public static void main(String[] args) {

        double side;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of the triangle: ");
        side = scanner.nextDouble();

        System.out.println("Enter height of the triangle: ");
        height = scanner.nextDouble();


        System.out.println("The surface of the triangle is: " + (side*height/2) + "cm");
    }
}
