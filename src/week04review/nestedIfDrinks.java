package week04review;

public class nestedIfDrinks {
    public static void main(String[] args) {
        String selection= "Drink";
        String drinkitem="Coffe";
        String snackItem="Chips";
        if (selection == "Drink") {
            System.out.println("Drink option is selected.");
            if(drinkitem=="tea"){
                System.out.println("Tea item is selected");
            }else if(drinkitem=="coffe"){
                System.out.println("Coffe item is selected");
            }
        } else if (selection == "snackItem") {
            System.out.println("Snack option is selected.");
            if(snackItem=="Chips"){
                System.out.println("Chips item is selected.");
            }else if(snackItem=="Candy"){
                System.out.println("Candy item is selected");
            }
        }else{
            System.err.println("Invalid Selection");
        }
        }
        }


