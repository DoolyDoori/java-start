package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println();
        }
        System.out.println("m = " + m);
    }
}
// more effective than Scope 3_1  => save resource and more looks good
