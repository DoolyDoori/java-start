package cond.ex;

public class GradeSwitchEx   {

    public static void main(String[] args) {

        String grade = "A";

         switch (grade) {
             case "A":
                 System.out.println("Highest Honors :D");
                 break;
             case "B":
             System.out.println("High Honors :)");
                 break;
             case "C":
             System.out.println("Honors :|");
                 break;
             case "D":
             System.out.println("Pass :/");
                 break;
             case "F":
             System.out.println("Fail :( ");
                 break;
             default:
             System.out.println("Invalid Value X( ");
                 break;
         }

    }
}
