package operator;

public class Comp2 {

    public static void main(String[] args) {

        //String compare
        String str1 = "word1";
        String str2 = "word2";

        boolean result1 = "Hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("word1");// 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교


        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);


    }
}
