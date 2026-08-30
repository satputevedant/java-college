class FoodDelivery {
    String customerName = "Vedant";
    String foodItem = "Pizza";

    class OrderDetails {
        void displayOrder() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Food Item: " + foodItem);
        }
    }

    interface DeliveryStatus {
        void updateStatus();
    }

    public static void main(String[] args) {
        FoodDelivery order = new FoodDelivery();
        FoodDelivery.OrderDetails details = order.new OrderDetails();
        details.displayOrder();

        DeliveryStatus confirmed = new DeliveryStatus() {
            @Override
            public void updateStatus() {
                System.out.println("Order Confirmed");
            }
        };

        DeliveryStatus delivered = new DeliveryStatus() {
            @Override
            public void updateStatus() {
                System.out.println("Order Out for Delivery");
            }
        };

        confirmed.updateStatus();
        delivered.updateStatus();
    }
}
