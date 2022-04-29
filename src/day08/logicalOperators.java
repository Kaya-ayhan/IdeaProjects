package day08;

public class logicalOperators {
    public static void main(String[] args) {
        String name1="Josh";
        int creditScore=720;
        int age=23;
        int income=40000;
        boolean isEligible1= creditScore>=700 && age>=21 && income>=50000;
        System.out.println(name1+" is eligible for loan: "+isEligible1);
        System.out.println("----------------------------------------");

        String name2="Jay";
        int age2=36;
        char gender='M';
        boolean isEligible= age2>=35 && (gender=='M' || gender=='F');
        System.out.println(name2+" is eligible for the job: "+isEligible);
        System.out.println("---------------------------------------------");

        String name4="James",
               countryofBirth="UK";
        boolean isMarriedtoUk=false;
        boolean iseligibleforcitizen4= countryofBirth== "USA" || isMarriedtoUk==true;
        System.out.println(name4+" is citizen of USA: "+iseligibleforcitizen4);

        System.out.println("--------------------------");
        String name5="Anna";
        double gpa=3.5;
        int familyIncome=35000;
        boolean isEligible5=gpa>=3.5 || familyIncome>=30000;
        System.out.println(name5+" is eligible for scholarship: "+isEligible5);

        System.out.println("-----------------------------");
        boolean result2=true;
        System.out.println("result2: "+result2);
        boolean result3=!result2;
        System.out.println("result3: "+result3);
        System.out.println("---------------------");
        int score=85;
        boolean passed=score>=60;
        boolean failed=!passed;
        System.out.println("Passed: "+passed);
        System.out.println("Failed: "+failed);



    }
}
//eligible for credit number>=700   age>=