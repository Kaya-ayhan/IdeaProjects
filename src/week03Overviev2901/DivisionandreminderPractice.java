package week03Overviev2901;

public class DivisionandreminderPractice {
    public static void main(String[] args) {
        // input is 45000 seconds how many minutes or hours makes it
        int inputSecond=65000;
        int hours, minutes,seconds;
        seconds= inputSecond%60;
        minutes= (inputSecond/60)%60;
        hours= inputSecond/36000;
        String clock= "Hours: "+hours+" Minutes: "+ minutes+" Seconds: "+seconds;
        System.out.println("Clock:"+clock);




    }
}
