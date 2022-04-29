package day09;

public class minNumber {
    public static void main(String[] args) {
        int num1=200,
            num2=200;
        boolean n1ismin= num1<num2;
        boolean n2ismin=num2<num1;
        boolean anynum=num1==num2;
        if(n1ismin){
            System.out.println(num1+" is the minimum number.");
        }
        if(n2ismin){
            System.out.println(num2+" is the mininmum number.");
        }

        if(anynum){
            System.out.println("Equal");
        }



        //if(num1<num2){
           // System.out.println(num1+" is the minimum number");
        }
    }

