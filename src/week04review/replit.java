package week04review;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1=scan.nextLine();
        double price1=scan.nextDouble();
        System.out.println("Enter item1 and its Price:");

        System.out.println("Enter item2 and its price2:");
        String item2=scan.next();
        double price2= scan.nextDouble();

        System.out.println("Enter item3 and its price3:");
        String item3=scan.next();
        double price3= scan.nextDouble();

        double totalprice= price1+price2+price3;

        System.out.println( "Item1: " + item1 + " Price: " + price1+ ",Item2: " + item2 + " Price: \n" + price2 + "," + "Item3: " + item3 + " Price: " + price3+" \nTotal price: " + totalprice);

    }

}

