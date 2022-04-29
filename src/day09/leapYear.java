package day09;

public class leapYear {
    public static void main(String[] args) {
        int y1=2001;
        boolean leapyear= y1%4==0;
        if(leapyear){
            System.out.println("Year "+y1+" is the leap year.");
        }
        if(!leapyear){
            System.out.println("Year "+y1+" is not the leap year.");
        }
        System.out.println("--------------------------");
        if(leapyear) {
            System.out.println("Year " + y1 + " is the leap year.");
        }else{
            System.out.println("Year "+y1+" is not the leap year.");
        }
    }
}
