package week04review;

public class nestedIfExercise {
    public static void main(String[] args) {
        boolean isRusHour = false;
        int carType = 2; //1, 2,3,4,5,6:motorcycle
        double price = 0.0;
        if (carType == 1) {
            price = 35.5;
        } else {
            price = 32;
        }
        System.out.println(price);
    }
}