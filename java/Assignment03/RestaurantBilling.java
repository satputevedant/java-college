public class RestaurantBilling {
    private static int totalOrders;
    static double bill(double food) { totalOrders++; return food; }
    static double bill(double food, double packing) { totalOrders++; return food + packing; }
    static double bill(double food, double packing, double delivery) { totalOrders++; return food + packing + delivery; }
    public static void main(String[] args) {
        System.out.printf("Dine-in: %.2f%n", bill(500));
        System.out.printf("Takeaway: %.2f%n", bill(500, 25));
        System.out.printf("Delivery: %.2f%n", bill(500, 25, 40));
        System.out.println("Total orders: " + totalOrders);
    }
}
