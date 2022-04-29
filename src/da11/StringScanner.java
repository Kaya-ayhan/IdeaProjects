package da11;

public class StringScanner {
    public static void main(String[] args) {

        String browserName="opera";
        String result="";
        boolean validBrowser=browserName=="crome" || browserName=="safari" || browserName=="edge"
                || browserName=="firefox" || browserName=="opera";
        if(validBrowser){
            if(browserName=="crome"){
                result="Crome Browser is Selected.";
            }
            else if(browserName=="safari"){
                result = "Safari Browser is selected.";
            }
            else if(browserName=="edge"){
               result= "Edge Browser is Selected.";
            }
            else if(browserName=="firefox"){
               result= "Firefox Browser is Selected.";
            }else{
               result= "Opera Browser is Selected.";
            }
            System.out.println(result);
        }else{
            System.out.println("Invalid Browser");
        }
    }
}
