package day07_Operators;

public class PreIncrement {
    public static void main(String[] args) {
         int num1= +25;
         int num2= -25;
        System.out.println(num1<num2); //false
        System.out.println(num1>num2);//true


        int a=5;
        ++a; // increase the value at that moment
        System.out.println(a);//6
        --a;
        System.out.println(a);//5

        int b=100;
        System.out.println(++b); //pre increment /decrement hemen arttıtırı / azaltır
        int c=200;
        System.out.println(c++);//post increment/decrement hemen arttırmaz 1 basamak sonra arttırır/azaltır
        System.out.println(c);
        System.out.println("-----------------------------------");
        int x= 200;
        System.out.println(x--); //azalttı ama yansıtmadı
        System.out.println(--x); //post ile beraber azalttığı için -2 azalttı
        int y=25;
        System.out.println(y++);
        System.out.println(y--);
        System.out.println(y);



    }
}
