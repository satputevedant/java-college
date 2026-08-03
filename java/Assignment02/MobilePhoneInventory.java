public class MobilePhoneInventory {
    static class Mobile {
        String model;
        double price;
        Mobile() { this("Unknown", 0); }
        Mobile(String model, double price) { this.model = model; this.price = price; }
        Mobile(Mobile other) { this(other.model, other.price); }
        void display() { System.out.printf("%s: Rs. %.2f%n", model, price); }
    }
    public static void main(String[] args) {
        Mobile original = new Mobile("JavaPhone", 29999);
        original.display();
        new Mobile(original).display();
    }
}
