class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

public class VehicleInsurance extends Vehicle {
    double premium;

    VehicleInsurance(String brand, double premium) {
        super(brand);
        this.premium = premium;
    }

    void displayInsurance() {
        super.display();
        System.out.println("Insurance Premium: Rs. " + premium);
    }

    public static void main(String[] args) {
        VehicleInsurance vehicle = new VehicleInsurance("Toyota", 18000);
        vehicle.displayInsurance();
    }
}
