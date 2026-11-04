package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {

        //Example of prefix add
        int a = 1;
        int b = 0;
        b = ++a; // a의 값을 증가시키고 그 결과를 B에 대입
        System.out.println("a = " + a + ", b = " + b);

        //Example of postfix add
        a = 1;
        b = 0;
        b = a++; // a의 현재 값을 먼저 b에 대입하고, 그 후 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);



    }
}
