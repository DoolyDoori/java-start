package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a String (type 'exit' to quit): ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Exiting the program");
                break;
            }
            System.out.println("You Entered : " + str);
        }


    }
}
