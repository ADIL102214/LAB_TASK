public class Wallet_Task_3 {
    private int balance;
    private final int id;
    static int counter = 0;
    Wallet_Task_3(){
        this(0);
    }
    Wallet_Task_3(int amount){
        //this.counter++;
        this.balance = amount;
        this.id = 10221400 + ++counter;
    }
    public static void main(String[] args){
        Wallet_Task_3 w1 = new Wallet_Task_3();
        Wallet_Task_3 w2 = new Wallet_Task_3(1000);
        System.out.println("Balance of wallet 1 is " + w1.balance + " ID of wallet 1 is " + w1.id);
        System.out.println("Balance of wallet 2 is " + w2.balance + " ID of wallet 2 is " + w2.id);
    }
}