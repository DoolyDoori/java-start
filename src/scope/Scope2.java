package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { //inside for block
            System.out.println("for m = " + m);
            System.out.println("for i = " + i);
        } // 'i' is over (for statement ends)
        System.out.println("main m = " + m);
        // System.out.println("main i = " + i); // Error(unreachable)
    }
}
