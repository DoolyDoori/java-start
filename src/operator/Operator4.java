package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;  //(2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // == sum3, Good!

        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}

/*
sum3, sum4 는 같지만 코드 설계 시 다른 이들이 보기에도 명확해야하므로
sum3 같은 표기보다 sum 4 같은 표기로 하는게 바람직하다.
*/
