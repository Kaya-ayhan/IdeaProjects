package day07_Operators;

public class shorthandOperators {
    public static void main(String[] args) {
        //assignment= reassignment the variables
        int number1=100;
        System.out.println("number1 = " + number1); //print:100
        number1=200+1;
        System.out.println("number1 = " + number1); //200

        String word= "Cydeo";
        System.out.println("word = " + word);
        word="Wooden Spoon";
        System.out.println("word = " + word);
        word = "20";
        System.out.println("word = " + word);
        System.out.println("--------------------------------");
        //addition variable
        int x=100;
        System.out.println("x = " + x); //100
        System.out.println(x+200);//3000
        System.out.println("x = " + x);//100
        x+=200;
        System.out.println("x = " + x);
        String str= "Wooden ";
        str+="Spoon";
        System.out.println("str = " + str);

        double num1=2.5;
        System.out.println("num1 = " + num1);
        num1+=8.4;
        System.out.println("num1 = " + num1);
        double availableBalance=1000.50;
        //deposit=300$
        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("--------------------------------");

        //withdrawing:500½
        availableBalance-=500;
        System.out.println("availableBalance = " + availableBalance);//1300,5-500

        System.out.println("--------------------------------");
         double salary=50000.5;
        System.out.println("salary = " + salary);
         salary*=2;
        System.out.println("salary = " + salary);
        salary/=3;
        System.out.println("salary = " + salary);

        System.out.println("--------------------------------");
        double num3=3;
        num3 %=3;
        System.out.println("num3 = " + num3);
        System.out.println("--------------------------------");
        int amount =127;
        int quarters=amount/25;
        int cents=amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("--------------------------------");
        int cents2=127;
        cents2 %=25;
        System.out.println("cents2 = " + cents2);

        System.out.println("--------------------------------");
        int y=300;
        y%=16;
        System.out.println("y = " + y);





    }
}
