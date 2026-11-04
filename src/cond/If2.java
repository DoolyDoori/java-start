package cond;

public class If2 {

    public static void main(String[] args) {
        int age = -19;

        if (age >= 20) {
            System.out.println("You are an adult");
        }
        else if (age >= 0){
            System.out.println("You are a minor");
        }
        else{
            System.out.println("Error: Please insert non-negative integer");
        }
    }
}
// TODO: change conditions sequence