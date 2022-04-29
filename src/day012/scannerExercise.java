package day012;

import java.util.Scanner;

public class scannerExercise {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter you full name");
        String fullname= scan.nextLine();
        System.out.println("Enter your building number:");
        String buildingNumber= scan.next();
        scan.nextLine();
        System.out.println("Enter the Street name:");
        String streetName= scan.nextLine();
        System.out.println("Enter your city");
        String city= scan.nextLine();
        System.out.println("Enter your State:");
        String state= scan.next();
        System.out.println("Enter your Zipcode ");
        String zipcode=scan.next();
        System.out.println("Enter your country name:");
        String countryName= scan.nextLine();
        System.out.println(fullname+", "+buildingNumber+", "+streetName+", "+city+", "+state+", "+zipcode+", "+countryName);

    }

}
/*
full name nextline()
building number next()
street name netLine()
city nextline()
state next()
zipcode  next()
display shipping adress  nextline()
*/

