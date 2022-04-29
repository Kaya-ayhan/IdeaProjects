package day_06;

public class Implıcıt {
    public static void main(String[] args) {
        byte a=100;
        short b=a;
        int c=b;
        long d=c;
        float e=d;
        double f=e;
        System.out.println("f = " + f);
        System.out.println("----------------------------");
        int x=100;
        short y= (short)x;
        System.out.println("y = " + y);


    }
}
