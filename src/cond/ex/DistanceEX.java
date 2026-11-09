package cond.ex;

public class DistanceEX {

    public static void main(String[] args) {
        int distance = 300;

        if (distance < 0){
            System.out.println("[Error]: invalid value");
            return;
        }
        if (distance <= 1) {
            System.out.println("Walk");
        } else if (distance <= 5) {
            System.out.println("Bike");
        } else if (distance <= 25 ) {
            System.out.println("Car");
        } else if (distance <= 250) {
            System.out.println("aeroplane");
        }
    }
}
