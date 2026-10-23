/** Assignment 26: deposit and withdrawal tasks implemented with Runnable. */
public class Assignment26RunnableTasks {

    static class Account {
        private int balance = 1000;

        synchronized void deposit(int amount) {
            balance += amount;
            System.out.println("Deposit +" + amount + ", balance=" + balance);
        }

        synchronized void withdraw(int amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdraw -" + amount + ", balance=" + balance);
            } else {
                System.out.println("Withdrawal refused: insufficient balance");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();

        Thread deposits = new Thread(() -> {
            for (int count = 0; count < 5; count++) {
                account.deposit(100);
                pause();
            }
        }, "Depositor");

        Thread withdrawals = new Thread(() -> {
            for (int count = 0; count < 5; count++) {
                account.withdraw(80);
                pause();
            }
        }, "Withdrawer");

        deposits.start();
        withdrawals.start();
        deposits.join();
        withdrawals.join();
    }

    private static void pause() {
        try {
            Thread.sleep(40);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}
