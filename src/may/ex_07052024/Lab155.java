package may.ex_07052024;

public class Lab155 {
    public static void main(String[] args) {
        //1 Friend --> Money
        //1 Begger --> Money

        System.out.println("Start of the program");

        int money = giveMoneyFriend(100);
        System.out.println(money);

        giveMoneyBegger();
        System.out.println("End of the program");


    }



     static void giveMoneyBegger() {
         System.out.println("Blessings!!");
    }

    static int giveMoneyFriend(int i) {
        //After 6 months
        i = i + 30;
         return i;
    }
}
