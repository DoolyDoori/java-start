package operator;

public class Operator2 {

    public static void main(String[] args) {

        // String + String (1)
        String result1 = "hello " + "World";
        System.out.println(result1);

        //String + String (2)
        String s1 = "String1 ";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //String + number (1) -> convert a number to a string
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        //String + number (2)
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        // 문자열에 더하는것은 모두 문자열이 된다.


    }
}
