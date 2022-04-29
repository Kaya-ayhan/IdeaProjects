package day14;

public class Stringexe {
    public static void main(String[] args) {
        String str1= "      batch25    ";
        str1.trim();
        System.out.println(str1);
        str1=str1.trim();
        System.out.println(str1);
        System.out.println("----------------");
        String s1="Java Programming Language";
        int n1=s1.indexOf("g");
        System.out.println("n1 = " + n1);
        int n2=s1.indexOf("gu");
        System.out.println("n2 = " + n2);
        int n3=s1.lastIndexOf("an");
        System.out.println("n3 = " + n3);




    }
}
