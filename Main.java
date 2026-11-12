import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        String latte = "Latte";
        double lattePrice = 5.50;

        String cappucino = "Cappucino";
        double cappucinoPrice = 4.50;

        String espresso = "Espresso";
        double espressoPrice = 3.00;


        System.out.println("=== COFFEE SHOP MENU ===");
        System.out.println(latte + " - $" + lattePrice);
        System.out.println(cappucino + " - $" + cappucinoPrice);
        System.out.printf("%s - $%.2f%n", espresso, espressoPrice);


    }
}
