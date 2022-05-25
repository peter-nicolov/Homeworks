package Demo;

import java.util.Scanner;

public class ExcerciseTriangles {
    public static void main(String[] args) {

        double angleA, angleB, angleC, sumAngles;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add angle A: ");
        angleA = scanner.nextDouble();

        System.out.println("Add angle B: ");
        angleB = scanner.nextDouble();

        System.out.println("Add angle C: ");
        angleC = scanner.nextDouble();

        sumAngles = angleA + angleB + angleC;

        if (angleA > 0 && angleB > 0 && angleC > 0) {
            if (sumAngles == 180) {
                System.out.println("The triangle is possible");

                if (angleA == 90 || angleB == 90 || angleC == 90) {
                    System.out.println("The triangle is right-angled");
                } else if (angleA < 90 && angleB < 90 && angleC < 90) {
                    System.out.println("The triangle is acute");
                } else {
                    System.out.println("The triangle is obtuse");
                }

                if (angleA == angleB && angleB == angleC) {
                    System.out.println("The triangle is equilateral");
                } else if (angleA == angleB || angleB == angleC || angleC == angleA) {
                    System.out.println("The triangle is isosceles");
                } else {
                    System.out.println("The triangle is multifaceted");
                }

            } else {
                System.out.println("The triangle is not possible!");
                System.out.println("Enter positive values for each angle!");
            }
        }

    }
}

