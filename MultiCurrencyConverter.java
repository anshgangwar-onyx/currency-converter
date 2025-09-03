import java.util.Scanner;

public class MultiCurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Exchange rates (as of today, approximate)
        double usdToInr = 70.0;
        double eurToInr = 80.0;
        //double gbpToInr = 103.0;
        double jpyToInr = 0.59;

        //System.out.println("Welcome to Currency Converter!");
        System.out.println("Convert to INR from:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        //System.out.println("3. GBP");
        System.out.println("3. JPY");
        System.out.print("Choose an option (1-4): ");
        int choice = input.nextInt();

        System.out.print("Enter amount: ");
        double amount = input.nextDouble();

        double result = 0;

        if (choice == 1) {
            result = amount * usdToInr;
            System.out.println(amount + " USD = " + result + " INR");
        } else if (choice == 2) {
            result = amount * eurToInr;
            System.out.println(amount + " EUR = " + result + " INR");
        } //else if (choice == 3) 
           // result = amount * gbpToInr;
            //System.out.println(amount + " GBP = " + result + " INR");
         else if (choice == 3) {
            result = amount * jpyToInr;
            System.out.println(amount + " JPY = " + result + " INR");
        } else {
            System.out.println("Invalid choice. Please select 1 to 3.");
        }

        input.close();
    }
}