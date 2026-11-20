package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;  // int => long
        System.out.println("longValue = " + longValue); //result: 10

        doubleValue = intValue; //int => double
        System.out.println("doubleValue = " + doubleValue); //result: 10.0

        doubleValue = 20L; // long => double
        System.out.println("doubleValue2 = " + doubleValue); //result: 20.0
    }
}
//NOTE: A smaller numeric type is automatically cast to a larger numeric type