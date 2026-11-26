package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the food name: ");
        String foodName = input.nextLine();

        System.out.print("Enter the price: ");
        int foodPrice = input.nextInt();

        System.out.print("Enter the Quantity: ");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println("You ordered " + foodQuantity + " of " + foodName + ". The total price is " + totalPrice );

    }
}
