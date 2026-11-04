package cond;

public class CondOp1 {

    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18) {
            status = "Adult";
        } else {
            status = "minor";
        }
        System.out.println("age = " + age + " | status = " + status);
    }

}

// Select a value based on a condition.