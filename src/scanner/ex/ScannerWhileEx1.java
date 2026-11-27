package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter your name (type 'exit' to quit): ");
            String userName = input.nextLine();

            if (userName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter your age (type -1 to quit): ");
            int userAge = input.nextInt();
            input.nextLine();

            if (userAge == -1) {
                break;
            }

            System.out.println("Your name is " + userName + ". Your age is " + userAge);
        }
        System.out.println("Exiting the program.");
    }

}
