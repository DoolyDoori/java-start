package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type '0' to both number to quit \n");

        while (true){
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 == 0 && num2 == 0) {
            System.out.println("Exiting the program..");
            break;
            }

        int sum = num1 + num2;
        System.out.println("sum of the numbers:  " + sum);

        }
    }
}
