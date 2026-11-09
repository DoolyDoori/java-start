package cond.ex;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 10;

        if (dollar < 0) {
            System.out.println("Invalid Value");
        } else if (dollar == 0) {
            System.out.println("There is nothing to exchange");
        } else {
            int won = dollar * 1400;
            System.out.println(won+" KRW");
        }
    }
}
