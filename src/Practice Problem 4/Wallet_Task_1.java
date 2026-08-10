public class Wallet_Task_1 {
    static int balance_1, balance_2;
    static int deposit(int balance, int amount){
       return balance + amount;
    }
    static int withdraw(int balance, int amount){
        return balance - amount;
    }
    public static void main(String[] args){
        balance_1 = 1000;
        balance_2 = 500;
        balance_1 = deposit(balance_1, 500);
        balance_2 = withdraw(balance_2, 250);
        System.out.println("Balance 1 : " + balance_1);
        System.out.println("Balance 2 : " + balance_2);
    }
}