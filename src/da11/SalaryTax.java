package da11;

import java.util.Scanner;

public class SalaryTax {
    public static void main(String[] args) {
        System.out.println("Enter Your Salary:");
        Scanner scan= new Scanner(System.in);
        double salary= scan.nextDouble();
        double taxRate;
        boolean isMarried= true;
        if(salary>=130_000){
            taxRate=0.35;

        }else if(salary<130_000 && salary>=100_000){
            taxRate=0.30;
        }else if(salary>=80_000 && salary<100_000){
            taxRate=0.25;
        }else{
            taxRate=0.20;
        }
        if(isMarried){
            taxRate -=0.05;
        }
        System.out.println("Tax Rate is: "+taxRate);

        }
    }

