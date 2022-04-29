package day09;

public class posNegNum {
    public static void main(String[] args) {
        int n= -100;

        /*System.out.println("Positive");
        System.out.println("Negative");
        System.out.println("Zero"); */
        System.out.println("----------------------------");
        boolean positive = n>0;
        boolean negative = n<0;

         if(positive){
             System.out.println("Positive");
         } else if(negative){
             System.out.println("Negative");
         }else{
             System.out.println("Zero");
         }
    }
}
