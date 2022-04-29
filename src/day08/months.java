package day08;

public class months {
    public static void main(String[] args) {

        int number=5;
        boolean has28days= number==2;
        boolean has30days= number==4 || number==6 || number==9 || number==11;
        //boolean has31days=number==1 || number==3 || number==5 || number==7 || number==8 || number==10 || number==12;
        boolean has31days= !has28days && !has30days;
        if (has28days){
            System.out.println("28 Days");
        }
        if (has30days){
            System.out.println( "30 Days");
        }//
        if (has31days){
            System.out.println("31 Days");
        }
    }
}
