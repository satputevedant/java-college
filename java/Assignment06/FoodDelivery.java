public class FoodDelivery {
    class Order { void show() { System.out.println("Order #501: Vegetable Pizza"); } }
    interface DeliveryUpdate { void update(String status); }
    public static void main(String[] args) {
        FoodDelivery app = new FoodDelivery();
        app.new Order().show();
        DeliveryUpdate update = new DeliveryUpdate() { public void update(String status) { System.out.println("Status: " + status); } };
        update.update("Out for delivery");
    }
}
