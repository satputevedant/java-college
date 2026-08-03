public class PaymentAbstraction {
    static abstract class Payment { abstract void pay(double amount); }
    static class CreditCard extends Payment { void pay(double amount) { System.out.println("Credit card payment: " + amount); } }
    static class UPI extends Payment { void pay(double amount) { System.out.println("UPI payment: " + amount); } }
    public static void main(String[] args) { Payment[] payments = { new CreditCard(), new UPI() }; for (Payment p : payments) p.pay(750); }
}
