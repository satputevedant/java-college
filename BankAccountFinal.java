final class BankAccount {
    private final int accountNumber = 101;

    final void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("The final variable and final method cannot be changed or overridden.");
    }
}

public class BankAccountFinal {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.display();
        System.out.println("The final class cannot be inherited.");
    }
}
