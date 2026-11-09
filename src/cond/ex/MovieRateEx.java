package cond.ex;

public class MovieRateEx {

    public static void main(String[] args) {
        double rating  = 6;

        if (rating <= 9){
            System.out.println("We recommend <Lord Of the Rings> series");
        }
        if (rating <= 8) {
            System.out.println("We recommend <Harry potter> series");
        }
        if (rating <= 7) {
            System.out.println("We recommend <Godzilla> ");
        }
    }
}
// NOTE: Use independent if statements to execute all matchings branches.
// TODO: negative double ratings or NaN cases