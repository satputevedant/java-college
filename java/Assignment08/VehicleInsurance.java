public class VehicleInsurance {
    static class Vehicle { String number; Vehicle(String number) { this.number = number; } }
    static class Insurance extends Vehicle { double premium; Insurance(String number, double premium) { super(number); this.premium = premium; } void show() { System.out.println("Vehicle: " + super.number + ", Premium: Rs. " + premium); } }
    public static void main(String[] args) { new Insurance("MH12AB1234", 8500).show(); }
}
