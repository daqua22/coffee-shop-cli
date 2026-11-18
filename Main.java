import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        String latte = "Latte";
        double lattePrice = 5.50;

        String cappuccino = "Cappuccino";
        double cappuccinoPrice = 4.50;

        String espresso = "Espresso";
        double espressoPrice = 3.00;

         Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println();

        System.out.println("Hello " + name + "! Take a look at the menu and choose a drink (1-3).");
        
        System.out.println();

        System.out.println("=== COFFEE SHOP MENU ===");
        System.out.printf("1. %s - $%.2f%n", latte, lattePrice);
        System.out.printf("2. %s - $%.2f%n",cappuccino, cappuccinoPrice);
        System.out.printf("3. %s - $%.2f%n", espresso, espressoPrice);


        System.out.print("Option: ");
        int drinkChoice = input.nextInt();
        double checkTotal = 0.0;

        if (drinkChoice == 1) {
            System.out.println("You ordered a Latte!");
            checkTotal = lattePrice;
        } else if (drinkChoice == 2) {
            System.out.println("You ordered a Cappuccino!");
            checkTotal = cappuccinoPrice;
        } else if (drinkChoice == 3) {
            System.out.println("You ordered an Espresso!"); 
            checkTotal = espressoPrice;
        } else {
            System.out.println("Select an option between 1 and 3.");
        
        }
        
        if (drinkChoice >= 1 && drinkChoice <= 3) {
            System.out.print("How many drinks would you like: ");
            
            int drinkQuantity = input.nextInt();
         
            checkTotal *= drinkQuantity ;
            
            System.out.printf("Your total is: $%.2f%n", checkTotal);
        }

        //System.out.println("Thank you, " + name + "!");
        //System.out.println("You selected option #" + drinkChoice + ".");

        input.close();
    }
}
