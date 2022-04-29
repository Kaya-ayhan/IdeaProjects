package day10;

import java.util.Scanner;

public class gradeReport {
    public static void main(String[] args) {
        /* 90-100: excellence
        80-89: great
        70-79:good
        60-69:passed
        0-59: failed
         */
        System.out.println("Write your grade:");
        Scanner scan= new Scanner(System.in);
        int score= scan.nextInt();

        if(score>=0 && score<=100){
            if(score>=90){
                System.out.println("Excellence");
            }if(score>=80 && score<=89){
                System.out.println("Great");
            }if(score>=70 && score<=79){
                System.out.println("Good");
            }if(score>=60 && score<=69){
                System.out.println("Passed");
            }if(score<=59){
                System.out.println("Failed");
            }

        }else{
            System.out.println("Score is not valid.");
        }
    }

}
