package week03Overviev2901;

public class grader {
    public static void main(String[] args) {
        // for a given assign grade 90-100:A
        //80-89:B
        //70-79:C
        //60-69:D
        // <=59 :F
        int s=95;
        if (s>=0 && s<=100){
            System.out.println("Your score is valid");
            if(s>=90 && s<=100){
                System.out.println("A");
            }
            if(s>=80&&s<=89){
                System.out.println("B");
            }
            if(s>=70 && s<=79){
                System.out.println("C");
            }
            if(s>=60 && s<=69){
                System.out.println("D");
            }
            if(s<=59){
                System.out.println("F");
            }
        }else{
            System.out.println("Your score is unvalid.");
        }

    }
}
