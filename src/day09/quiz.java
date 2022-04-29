package day09;

public class quiz {
    public static void main(String[] args) {
       // long a=30L;
      //  long b= (short)a;
       // System.out.println("b = " + b);
        /* float    a   =  100.987_6543f;

short  b  =  (byte) a ;

byte  c   = (byte) b;

         */
        float a=100.987_6543f;
        short b= (byte) a;
        byte c= (byte) b;
        System.out.println("c = " + c);
        System.out.println((3+2)*2/3%2);
        long x=3_000L;
        double y= (float) x;
        int d = (short) y;
        System.out.println(d%1000);
        System.out.println("d = " + d);
        System.out.println("y = " + y);
        System.out.println("d = " + d);
        System.out.println((int)(10.0/3));
        int ivar=100;
        double dvar=123;
        float fvar=200f;
        ivar= (int)fvar;
        fvar= (float)dvar;
        ivar=(int)dvar;
    }
}
