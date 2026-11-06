package cond.ex;

public class ScoreEx {

    public static void main(String[] args) {

        int score = -10;

        // Guard Clause
        if (score < 0 || score > 100) {
            System.out.println("[Error]: Invalid Score");
            return;
        }

        // grade
        if (score >= 90) {
            System.out.println("Grade = A");
        } else if (score >= 80) {
            System.out.println("Grade = B");
        } else if (score >= 70) {
            System.out.println("Grade = C");
        } else if (score >= 60) {
            System.out.println("Grade = D");
        } else {
            System.out.println("Grade = F");
        }
    }







}