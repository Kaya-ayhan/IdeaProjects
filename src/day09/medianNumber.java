package day09;

public class medianNumber {
    public static void main(String[] args) {
        int n1=23,
                n2=25,
                n3=20;
        boolean medn1= (n1>n2 && n1<n3)|| (n1>n3 && n1<n2);
        boolean medn2= (n2>n1 && n2<n3) || (n2<n1 && n2>n3);
        boolean medn3= (n3>n1 && n3<n2) || ( n3>n2 && n3<n1);
        if(medn1){
            System.out.println(n1+" is median number.");
        }
        if(medn2){
            System.out.println(n2+" is the median number.");
        }
        if(medn3){
            System.out.println(n3+" is the median number.");
        }
    }
}
