package loop;

public class Nested1 {

    public static void main(String[] args) {

        for(int i = 0; i < 2; i++ ) {
            System.out.println("Outer for Loop start. i: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> Inner for Loop " + i + " - " + j );
            }
            System.out.println("Outer for loop ends. i: " + i);
            System.out.println(); // for distribute each loop
        }
    }
}
