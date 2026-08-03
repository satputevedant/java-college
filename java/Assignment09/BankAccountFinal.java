public class BankAccountFinal {
    static final class Account { final long accountNumber; double balance; Account(long number, double balance) { accountNumber = number; this.balance = balance; } void show() { System.out.println("Account: " + accountNumber + ", Balance: " + balance); } }
    public static void main(String[] args) { new Account(123456789L, 15000).show(); }
}
