public class RestaurantBilling {
    static int totalOrders = 0;

    void calculateBill(int amount) {
        totalOrders++;
        System.out.println("Dine-in Bill = " + amount);
    }

    void calculateBill(int amount, boolean takeaway) {
        totalOrders++;
        int packingCharge = takeaway ? 20 : 0;
        System.out.println("Takeaway Bill = " + (amount + packingCharge));
    }

    void calculateBill(int amount, String address) {
        totalOrders++;
        int deliveryCharge = 50;
        System.out.println("Delivery Bill = " + (amount + deliveryCharge));
        System.out.println("Delivery Address = " + address);
    }

    public static void main(String[] args) {
        RestaurantBilling obj = new RestaurantBilling();
        obj.calculateBill(500);
        obj.calculateBill(300, true);
        obj.calculateBill(400, "Pune");
        System.out.println("Total Orders = " + totalOrders);
    }
}
