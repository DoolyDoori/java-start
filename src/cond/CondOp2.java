package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 18;
        String status  = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age = " + age + " | Status = " + status);
    }
}
