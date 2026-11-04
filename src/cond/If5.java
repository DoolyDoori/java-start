package cond;

//NOTE: Display discount details and the final prices clarity
public class If5 {

    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;
        System.out.println("총 가격 = " + price + " 원");

        if (price >= 10000){
            discount += 1000;
            System.out.println("10000원 이상 구매 시 , 1000원 할인");
        }
        if(0 <= age && age <= 10){
            discount += 1000;
            System.out.println("10세 이하 어린이 1000원 할인");
        }
        System.out.println("총 할인 금액: " + discount + " 원 | 최종 가격 " + (price - discount) + " 원");
    }

}
//TODO: (If it is real-time service) 1. minus total price, 2. negative integer age