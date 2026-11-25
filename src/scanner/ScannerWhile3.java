package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare outside the loop to preserve the accumulated sum.
        int sum = 0;

        while (true) {
            System.out.print("Enter the number!(type 0 to quit) : ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }
        System.out.println("Sum of the Entered number: " + sum);


    }

}

