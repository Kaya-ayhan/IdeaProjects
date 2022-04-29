package day012;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scan.nextDouble();
        scan.close();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
