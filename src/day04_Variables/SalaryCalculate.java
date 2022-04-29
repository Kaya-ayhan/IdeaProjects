package day04_Variables;

public class SalaryCalculate<hourlyRate> {
    public static void main(String[] args) {
        //hourlyRate  , weeklyHours;
        int hourlyRate=50;
        int weeklyHours=40;
        int salary=hourlyRate*weeklyHours*52;
        //System.out.println(salary);
        System.out.println("hourlyRate=$"+hourlyRate);
        System.out.println("weeklyHours="+weeklyHours);
        System.out.println("salary=$"+salary);
        /*System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("salary = " + salary);*/


    }


}
