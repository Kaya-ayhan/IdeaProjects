package da11;

import java.util.Scanner;

public class numberOfDays {
    public static void main(String[] args) {
        System.out.println("Eter Your Number:");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        String result="";
        int year=2003;
        switch(n){
            case 2:

                    result = (year%4==0 )?"29 Days" : "28 Days";

                break;
            case 4: case 6: case 9: case11:
                result = "30 Days";
                break;
            case 1:    case 3:    case 5:  case 7:  case 8:     case 11: case 12:
            result = "31 Days";
            break;
            default:
                result= "Invalid";
        }
        System.out.println(result);
    }
}
