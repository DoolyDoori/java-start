package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        //Consume the remaining newline
        System.out.print("Press \'Enter\' for next process ");
        scanner.nextLine();

        System.out.print("Please enter your age: ");
        int userAge = scanner.nextInt();

        //Guard Clause
        if (userAge < 0) {
            System.out.println("Age cannot be negative");
            return;
        }

        System.out.println("Your name is " + userName + " and your age is " + userAge);
    }
}
