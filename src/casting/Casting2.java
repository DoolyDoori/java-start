package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; => occur compile error (overflow)
        intValue = (int) doubleValue;  // casting
        System.out.println("intValue = " + intValue); //result: 1
    }
}
