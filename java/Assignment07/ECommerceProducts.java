public class ECommerceProducts {
    interface Product { double price(); String name(); }
    static abstract class BaseProduct implements Product { String item; double amount; BaseProduct(String item, double amount) { this.item = item; this.amount = amount; } public double price() { return amount; } public String name() { return item; } }
    static class Electronic extends BaseProduct { Electronic() { super("Headphones", 1999); } }
    static class Clothing extends BaseProduct { Clothing() { super("T-shirt", 799); } }
    static class Grocery extends BaseProduct { Grocery() { super("Rice", 650); } }
    public static void main(String[] args) { Product[] products = { new Electronic(), new Clothing(), new Grocery() }; for (Product p : products) System.out.println(p.name() + ": Rs. " + p.price()); }
}
