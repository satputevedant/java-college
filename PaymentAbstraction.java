abstract class Payment {
    abstract void pay(double amount);

    void receiptMessage() {
        System.out.println("Payment processed using abstraction");
    }
}

class CardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Card Payment: Rs. " + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("UPI Payment: Rs. " + amount);
    }
}

public class PaymentAbstraction {
    public static void main(String[] args) {
        Payment card = new CardPayment();
        card.receiptMessage();
        card.pay(1500);

        Payment upi = new UPIPayment();
        upi.pay(750);
    }
}
