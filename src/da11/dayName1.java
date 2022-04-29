package da11;

import java.util.Scanner;

public class dayName1 {
    public static void main(String[] args) {
        System.out.println("write your number:");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}
