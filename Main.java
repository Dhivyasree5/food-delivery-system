/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Zomato food Delivery System");
        System.out.println("Enter the food item you want to search: ");
        String foodItem = scanner.nextLine();

        System.out.println("Top Hotels for your " + foodItem + ":");
        System.out.println("1. Hotel 1:KONGU MESS");
        System.out.println("2. Hotel 2:ARUNACHALA");
        System.out.println("3. Hotel 3:VALLUVAR");

        System.out.print("Enter the hotel number you want to choose: ");
        int hotelChoice = scanner.nextInt();

        switch (hotelChoice) {
            case 1:
                hotel1(scanner, foodItem);
                break;
            case 2:
                hotel2(scanner, foodItem);
                break;
            case 3:
                hotel3(scanner, foodItem);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    static void hotel1(Scanner scanner, String foodItem) {
        System.out.println("Reviews for Hotel 1:KONGU MESS");
        System.out.println("4.5/5 stars has good rating");

        System.out.println("Price for " + foodItem + ":");
        System.out.println("Rs. 200");

        System.out.print("Do you have a coupon? (yes/no): ");
        String coupon = scanner.next();

        if (coupon.equalsIgnoreCase("yes")) {
            System.out.print("Enter the coupon code: ");
            String couponCode = scanner.next();
            System.out.println("Coupon applied successfully!");
            System.out.println("Discount: 10%");
            System.out.println("Total amount: Rs. 100");
        } else {
            System.out.println("No coupon applied.");
            System.out.println("Total amount: Rs. 200");
        }

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Total amount: Rs. " + (quantity * 200));
        System.out.println("Thanks for your order we will deliver the food soon!");
    
    }

    static void hotel2(Scanner scanner, String foodItem) {
        System.out.println("Reviews for Hotel 2:ARUNACHALA");
        System.out.println("4.2/5 stars");

        System.out.println("Price for " + foodItem + ":");
        System.out.println("Rs. 120");

        System.out.print("Do you have a coupon? (yes/no): ");
        String coupon = scanner.next();

        if (coupon.equalsIgnoreCase("yes")) {
            System.out.print("Enter the coupon code: ");
            String couponCode = scanner.next();
            System.out.println("Coupon applied successfully!");
            System.out.println("Discount: 15%");
            System.out.println("Total amount: Rs. 102");
        } else {
            System.out.println("No coupon applied.");
            System.out.println("Total amount: Rs. 120");
        }

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Total amount: Rs. " + (quantity * 120));
        System.out.println("Thanks for your order we will deliver the food soon!");
    }

    static void hotel3(Scanner scanner, String foodItem) {
        System.out.println("Reviews for Hotel 3:VALLUVAR");
        System.out.println("4.8/5 stars");

        System.out.println("Price for " + foodItem + ":");
        System.out.println("Rs. 150");

        System.out.print("Do you have a coupon? (yes/no): ");
        String coupon = scanner.next();

        if (coupon.equalsIgnoreCase("yes")) {
            System.out.print("Enter the coupon code: ");
            String couponCode = scanner.next();
            System.out.println("Coupon applied successfully!");
            System.out.println("Discount: 20%");
            System.out.println("Total amount: Rs. 120");
        } else {
            System.out.println("No coupon applied.");
            System.out.println("Total amount: Rs. 150");
        }

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Total amount: Rs. " + (quantity * 150));
        System.out.println("Thanks for your order we will deliver the food soon!");
    }
    
}