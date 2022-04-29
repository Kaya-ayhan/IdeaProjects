package day08;

public class evenlyDivisible {
    public static void main(String[] args) {
        int number=65;
        boolean a= number%2==0;
        boolean b= number%3==0;
        boolean c= number%5==0;
        System.out.println(number+" is divisible by 2: "+a);
        System.out.println(number+" is divisible by 3: "+b);
        System.out.println(number+" is divisible by 5: "+c);
    }
}
/*number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true */