package cond;

public class If4 {

    public static void main(String[] args) {
        int age = 3;

        if (age < 0){
            System.out.println("not a non-negative integer");
        }
        else if (age <= 7){
            System.out.println("Preschooler");
        }
        else if (age <= 13){
            System.out.println("Elementary School");
        }
        else if (age <= 16){
            System.out.println("Middle school");
        }
        else if(age <= 19){
            System.out.println("High school");
        }
        else{
            System.out.println("Adult");
        }

    }
}
