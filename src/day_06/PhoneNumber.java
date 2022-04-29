package day_06;

public class PhoneNumber {
    public static void main(String[] args) {
        byte countryCode=1;
        int areaCode=703;
        int localNumber=4512625;
        System.out.println("+"+countryCode+ "(" + areaCode+ ")" + "-" + localNumber);
    }
}
/*countryCode = 1
areaCode = 703
localNumber = 4512625
output:
+1(703)-4512625 */