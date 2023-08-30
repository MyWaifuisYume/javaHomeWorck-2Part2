public class Main {
    public static void main(String[] args) {

        int deposit = 1300;
        int balance = 100;
        int bonus;
        if (deposit >= 1000) {
          bonus = deposit / 100;
        } else {
           bonus = 0;
        }
        int actualBalance = deposit + balance + bonus;
        System.out.println("Актуальный баланс:" + actualBalance);
    }


}