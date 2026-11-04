package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000; // item price
        int age = 10; // consumer's age
        int discount = 0;
        System.out.println("Total price = " + price);

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
    } else if (0<= age && age <= 10 ) {
            discount += 1000;
            System.out.println("10세 이하 어린이 1000원 할인");
        }
        else{
            System.out.println("할인 해당사항 없음");
        }

        System.out.println("Total price = " + (price - discount) + " 원 + D/C = " + discount + " 원" );
        }
}
//note: at this time not adapted child D/C
