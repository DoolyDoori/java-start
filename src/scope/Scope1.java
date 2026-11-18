package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10;  // global variable
        if(true) {
            int x = 30;  // local variable
            System.out.println("if m = " + m); // Accessible from inside to outside the block
            System.out.println("if x = " + x);

        } // local variable done

            System.out.println("if m = " + m);
            //System.out.println("if x = " + x); // Not accessible from inside to outside the block
    }
}
