package operator;

public class Operator1 {

    public static void main(String[] args) {
         //initialize variables
        int num1 = 5;
        int num2 = 2;

        //summation
        int sum = num1 + num2;
        System.out.println("num1 + num2 = " + sum);

        //difference
        int diff = num1 - num2;
        System.out.println("num1 - num2 = " + diff);

        //multiplication
        int multi = num1 * num2;
        System.out.println("num1 * num2 = " + multi);

        //division, (0으로 나눌 수 없다.
        int div = num1 / num2;
        System.out.println("num1 / num2 = " + div);

        //modular
        int mod = num1 % num2; // result: 2 (int 끼리의 연산이므로 소수점 아래 자리는 날라감)
        System.out.println("num1 % num2 = " + mod);


    }
}
