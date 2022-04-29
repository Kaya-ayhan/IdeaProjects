package day13;

import java.util.Scanner;

public class ExerciseString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= scan.nextInt();
        System.out.println("Enter your gender:");
        String gender= scan.next();
        scan.nextLine();
        System.out.println("Enter your fullName:");
        String fullName= scan.nextLine();
        System.out.println("Enter your phone number:");
        long phoneNumber= scan.nextLong();
        System.out.println("Enter the zipcode");
        int zipCode= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your School name:");
        String school= scan.nextLine();
        System.out.println("Enter your city name");
        String citName=scan.nextLine();
        System.out.println("Enter your state name:");
        String stateName= scan.next();
        System.out.println("Enter your building number:");
        int buildingNumber= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street name:");
        String streetName= scan.nextLine();
        scan.close();
        System.out.println("1.Full Name: "+fullName +"\n2.Age: "+age+"\n 3.Gender:"+gender+"\n4.Phone Number: "+phoneNumber+
                "\n 5.Address: \n\t"+buildingNumber+" "+streetName+"\n"+citName+", "+zipCode+"\n6.School Name: "+ school);



    }
}


/*
warmup tasks:
	1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name string nextLine*/
