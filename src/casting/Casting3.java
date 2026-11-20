package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // max value of integer
        long maxIntOver = 2147483648L; // max value of integer + 1
        int intValue = 0;

        intValue = (int) maxIntValue;  // casting
        System.out.println("maxIntValue casting = " + intValue); //Output: 2147483647

        intValue = (int) maxIntOver;  // casting
        System.out.println("maxIntOver casting = " + intValue); //Output: -2147483648 (overflow)

    }
}
