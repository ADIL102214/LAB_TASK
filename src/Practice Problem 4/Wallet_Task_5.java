public class Wallet_Task_5 {
        private double balance;
        Wallet_Task_5(double balance){
            this.balance = balance;
        }
        static void addBonus(Wallet_Task_5 wallet, double amount){
            wallet.balance += amount;
        }
        static void swap(Wallet_Task_5 wallet1, Wallet_Task_5 wallet2){
            Wallet_Task_5 temp = wallet1;
            wallet1 = wallet2;
            wallet2 = temp;
        }
        public static void main(String[] args){
            Wallet_Task_5 wallet1 = new Wallet_Task_5(100);
            Wallet_Task_5 wallet2 = new Wallet_Task_5(1000);
            addBonus(wallet1, 500);
            System.out.println("Balance of wallet 1 is " + wallet1.balance);
            swap(wallet1, wallet2);
            System.out.println("Balance of wallet 1 is " + wallet1.balance);
            System.out.println("Balance of wallet 2 is " + wallet2.balance);
        }
}