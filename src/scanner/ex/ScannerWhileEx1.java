package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter your name (type 'exit' to quit): ");
            String userName = input.nextLine();

            if (userName.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. ");
                break;
            }

            System.out.print("Enter your age: ");
            int userAge = input.nextInt();
            input.nextLine();

            System.out.println("Your name is " + userName + ". Your age is " + userAge) ;
        }
    }

}
