package day08;

public class greatReport {
    public static void main(String[] args) {
        System.out.println(true!=false); //true
        System.out.println(!true!=false);//fslse
        System.out.println(!false==true);//false

        System.out.println(!!false);
        System.out.println(!!!true);

        System.out.println("----------------------------");
        int score=85;
        boolean a= score>=90 && score<=100;
        boolean b= score>=80 && !a;
        //boolean b= score>=80 && score<=89;
        boolean c= !a && !b && score>=70;
        //boolean c= score>=70 && score<=79;
        //boolean d= score>=60 && score<=69;
        boolean d= !a&&!b&&!c&&score<=69;
        boolean f= !a && !b && !c && !d && !d;
        //boolean f= score>=0 && score<=59;

       if(a) {
           System.out.println("Excellent");
       }
       if(b) {
           System.out.println("Great");
       }
      if(c) {
          System.out.println("Good");
      }
      if (d) {
          System.out.println("Passed");
      }
      if (f) {
          System.out.println("Failed");
      }

      }



        /* 90-100  excellence
        80-89 great
        70-79 good
        60-69  passed
        0-59 failed
         */
    }

