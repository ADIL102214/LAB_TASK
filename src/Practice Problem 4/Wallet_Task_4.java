import java.util.Scanner;

public class Wallet_Task_4 {
    static double balance;
    String lastMode;
    Wallet_Task_4(int amount){
        this.balance += amount;
    }
    void withdraw(int amount, String mode){
        this.balance -= amount;
        this.lastMode = mode;
        System.out.println(amount + " is withdrawn" + "\n" + "New balance is " + this.balance + "\n" + "Last mode was " + this.lastMode);
    }
    void withdraw(int amount){
        this.balance -= amount;
        this.lastMode = "ATM";
        System.out.println(amount + " is withdrawn" + "\n" + "New balance is " + this.balance + "\n" + "Last mode was " + this.lastMode);
    }
    public static void main(String[] args){
        Wallet_Task_4 w1 = new Wallet_Task_4(5000);
        w1.withdraw(500);
        w1.withdraw(600, "ONLINE");
    }
}