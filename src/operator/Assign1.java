package operator;

public class Assign1 {

    public static void main(String[] args) {
        int a = 5;
        a += 3; // :8 (5 + 3)
        a -= 2; // :6 (8 - 2)
        a *= 4; // :24 (8 * 4)
        a /= 3; // :8 (24 / 3)
        a %= 5; // :3 (8 % 5)
        // 각 복합대입 연산자는 [a = a (연산자) (숫자)] 꼴이다.
        System.out.println("a = " + a);
    }
}
