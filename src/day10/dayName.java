package day10;

import java.util.Scanner;

public class dayName {
    public static void main(String[] args) {
        System.out.println("Enter your day number:");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        String result= "";
        if(n>=1 && n<=7){
            if(n==7){
                result="Sunday";
            }if(n==6){
                result="Saturday";
            }if(n==5){
                result="Friday";
            }if(n==4){
                result="Thursday";
            }if(n==3){
                result="Wednesday";
            }if(n==2){
                result="Tuesday";
            }if(n==1){
                result="Monday";
            }
        }else{
            System.out.println("Invalid number");
        }
        System.out.println(result);
    }
}
