package day07_Operators;

public class relationalOperators {
    public static void main(String[] args) {
        //>, >=, <,<=
        boolean result1= 20>40;  // false
        System.out.println("result1 = " + result1);
        boolean result2= 200>40; // true
        System.out.println("result2 = " + result2);
        boolean result3 = 300>=150;  //true
        System.out.println("result3 = " + result3);
        boolean result4 = 100>=150; // false
        System.out.println("result4 = " + result4);
        System.out.println("--------------------------------------");

        int credit=745;  // eligible creditscore:720
        boolean eligibleloan=credit>=720;
        System.out.println("eligibleloan = " + eligibleloan);
        boolean result6= 200<150;
        System.out.println("result6 = " + result6);

        System.out.println("--------------------------------------");
        int score=59;
        boolean hasFailed=score<=59;
        System.out.println("hasFailed = " + hasFailed);
        int score2 = 75;
        boolean hasFailed1=score2<=59;
        System.out.println("hasFailed1 = " + hasFailed1);

        System.out.println("--------------------------------------");
        int x=100;
        int y=200;
        boolean equal=x==y;
        System.out.println("equal = " + equal);
        boolean result9= "Java"=="Java    ";
        System.out.println("result9 = " + result9);
        System.out.println("--------------------------------------");
        boolean result10= 100!=200;
        System.out.println("result10 = " + result10);// true
        boolean result11= "Java"!="java";
        System.out.println("result11 = " + result11);
        boolean result12= "Ayhan"!="Ayhan";
        System.out.println("result12 = " + result12);



    }
}
