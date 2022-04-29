package da11;

import java.util.Scanner;

public class gradeNum {
    public static void main(String[] args) {
        char n= 'D';
        String result="";
        switch(n){
            case 'A':
                result="Excellence";
                break;
            case 'B':
                result="Great";
                break;
            case 'C':
                result="Good";
                break;
            case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result="Invalid";

        }
        System.out.println(result);

    }
}
