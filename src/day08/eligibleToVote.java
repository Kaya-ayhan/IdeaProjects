package day08;

public class eligibleToVote {
    public static void main(String[] args) {
        String name1="James";
        int age1=38;
        String citizen="USA";
        boolean isEligible= age1 >= 21 && citizen == "USA";



        //eligible
        if (isEligible){
            System.out.println(name1+" is Eligible");
        }

        //not eligible
        if(!isEligible){
            System.out.println(name1+" is not Eligible");
        }

    }
}
