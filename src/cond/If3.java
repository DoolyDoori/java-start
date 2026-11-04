package cond;

public class If3 {

    public static void main(String[] args) {
        int age = 14;

        if (age < 0){
            System.out.println("Error: Please give me non-negative integer ");
        }
        if (0<= age && age <= 7){
            System.out.println("Preschooler");
        }
        if (8<= age && age <= 13){
            System.out.println("Elementary School student");
        }
        if (14 <= age && age <= 16){
            System.out.println("Middle School Student");
        }
        if (17 <= age && age <= 19){
            System.out.println("High School Student");
        }
        if (20 <= age){
            System.out.println("Adult");
        }
    }
}
 //TODO: Replace independent if statements with an else-if chain (cond.If4)