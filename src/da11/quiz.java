package da11;

public class quiz {
    public static void main(String[] args) {
        int n=0;
        if(n==0){
            n+=50;
        }
        if(n!=0){
            n +=50;
        }
        System.out.println(n);
        boolean a= true, b= !false;
        if(b){
            System.out.println("b");
        }else if(a){
            System.out.println("a");
        }else{
            System.out.println("c");
        }
        boolean result= true;
        if(result){
            System.out.println("e");
        }else{
            System.out.println("r");
        }
       boolean x= true;
        boolean y= !x==false;
        boolean z= y;
        if(x){
            System.out.println("yes");
        }if(y){
            System.out.println("no");
        }if(z){
            System.out.println("asdf");
        }
        int m=10;
        int t=m++;
        System.out.println(t++ +" "+ m++ +" "+t);
    }
}
