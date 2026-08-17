class Mobile {
    private String brand;
    private String model;
    private double price;

    Mobile() {
        this("Samsung", "Galaxy A15", 19999);
    }

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    Mobile(Mobile other) {
        this(other.brand, other.model, other.price);
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }
}

public class MobilePhoneInventory {
    public static void main(String[] args) {
        System.out.println("===== Exercise 2 =====");

        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile("OnePlus", "Nord CE 5", 24999);
        Mobile mobile3 = new Mobile(mobile2);

        mobile1.display();
        mobile2.display();
        mobile3.display();
    }
}
