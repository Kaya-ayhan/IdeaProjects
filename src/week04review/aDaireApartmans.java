package week04review;

import java.util.Scanner;

public class aDaireApartmans {
    public static void main(String[] args) {
        System.out.println("####Welcome to Adaire Apartmans.#### \n Enter number of bedrooms: ");
        Scanner scan= new Scanner(System.in);
        int numberOfBedrooms= scan.nextInt();
        double basePrice=0;
        switch (numberOfBedrooms){
            case 0:
                System.out.println("You select studio apartmant");
                basePrice=1200;
                break;
            case 1:
                System.out.println("You select one bedroom apartmant");
                basePrice= 1725;
                break;
            case 2:
                System.out.println("You select two bedroom apartmant");
                basePrice=2545;
                break;
            case 3:
                System.out.println("You select three bedroom apartmant");
                basePrice=3250;
                break;
            default:
                System.out.println(numberOfBedrooms+" bedroom apartmant not available.");
        }
        System.out.println(basePrice+"$ price");


    }
}
