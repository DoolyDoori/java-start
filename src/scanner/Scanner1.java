package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("문자열을 입력하세요");
        String str = scanner.nextLine(); // bring input to String
        System.out.println("입력한 문자열: " + str);

        System.out.println("정수를 입력하세요");
        int intValue = scanner.nextInt(); // bring input to integer
        System.out.println("입력한 정수: " + intValue);

        System.out.println("실수를 입력하세요");
        double doubleValue = scanner.nextDouble(); // bring input to double
        System.out.println("입력한 정수: " + doubleValue);


    }

}
