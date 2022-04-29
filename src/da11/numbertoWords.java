package da11;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class numbertoWords {
    public static void main(String[] args) {
        System.out.println("Write your number:");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        String result1=(n>=0 && n<=9)?
                (n==0)?"Zero" :(n==1)?"One" :(n==2)? "Two" :(n==3)?"Three" :(n==4)?"Four" :(n==5)?"Five" :(n==6)?"Six"
                        :(n==7)?"Seven" :(n==8)?"Eight" :"Nine"
                :"Invalid Number";
        System.out.println(result1);

        }


    }

