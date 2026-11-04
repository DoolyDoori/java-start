package cond;

public class If1 {

    public static void main(String[] args) {
        int age= -17;

        if (age>= 20){
            System.out.println("You're an adult");
        }
        if (age<20){
            System.out.println("You're a minor");
        }
    }
}
// 이런 경우에 음수,가 입력 되었을 때 어떻게 처리할지 생각해야할듯 ( 20 이만은 모두 미성년 처리이므로)
