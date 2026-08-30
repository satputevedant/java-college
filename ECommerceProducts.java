interface ProductInterface {
    void displayCategoryDetails();
}

class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("ID: " + productId + " | Name: " + name + " | Price: Rs. " + price);
    }
}

class ElectronicProduct extends Product implements ProductInterface {
    String warrantyPeriod;

    ElectronicProduct(int id, String name, double price, String warranty) {
        super(id, name, price);
        this.warrantyPeriod = warranty;
    }

    @Override
    public void displayCategoryDetails() {
        displayProduct();
        System.out.println("Category: Electronics, Warranty: " + warrantyPeriod);
    }
}

class ClothingProduct extends Product implements ProductInterface {
    String size;

    ClothingProduct(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public void displayCategoryDetails() {
        displayProduct();
        System.out.println("Category: Clothing, Size: " + size);
    }
}

public class ECommerceProducts {
    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct(101, "Dell XPS", 120000.0, "2 Years");
        ClothingProduct shirt = new ClothingProduct(201, "Polo T-Shirt", 1500.0, "Large");

        laptop.displayCategoryDetails();
        System.out.println();
        shirt.displayCategoryDetails();
    }
}
