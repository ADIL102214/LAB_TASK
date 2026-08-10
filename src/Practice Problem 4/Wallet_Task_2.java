public class Wallet_Task_2 {
        private int balance;
        Wallet_Task_2(int balance){
            this.balance= balance;
        }
        void deposit(int amount) {
            this.balance += amount;
        }
        void withdraw(int amount) {
            this.balance -= amount;
        }

        public static void main(String[] args) {
            Wallet_Task_2 w1 = new Wallet_Task_2(1000);
            w1.deposit(500);
            w1.withdraw(250);
            System.out.println("Balance of wallet 1 is " + w1.balance);

        }
}