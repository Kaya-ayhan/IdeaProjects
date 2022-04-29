package da11;

import java.util.Scanner;

public class terNesIf {
    public static void main(String[] args) {
        System.out.println("Write your grade:");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("Excellence");
            }
            if (score >= 80 && score <= 89) {
                System.out.println("Great");
            }
            if (score >= 70 && score <= 79) {
                System.out.println("Good");
            }
            if (score >= 60 && score <= 69) {
                System.out.println("Passed");
            }
            if (score <= 59) {
                System.out.println("Failed");
            }

        } else {
            System.out.println("Score is not valid.");
        }
        System.out.println("------------------------------");
        String Result1= (score >= 0 && score <= 100)? (score >= 90)?"Excellence" :(score >= 80 && score <= 89)?"Great)" :(score >= 70 && score <= 79)? "Good" :(score >= 60 && score <= 69)?"Passed" :"Failed" :"Invalid Score";
        System.out.println(Result1);

    }
}