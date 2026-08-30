import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000.0;
        try {
            System.out.print("Enter withdrawal amount: ");
            try {
                double amount = Double.parseDouble(scanner.nextLine());
                if (amount <= 0) throw new IllegalArgumentException("Amount must be greater than zero.");
                if (amount > balance) throw new IllegalArgumentException("Insufficient balance.");
                if (amount % 100 != 0) throw new IllegalArgumentException("Amount must be a multiple of 100.");
                balance -= amount;
                System.out.printf("Withdrawal successful. Remaining balance: %.2f%n", balance);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric amount.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid withdrawal: " + e.getMessage());
            }
        } finally {
            scanner.close();
        }
    }
}
