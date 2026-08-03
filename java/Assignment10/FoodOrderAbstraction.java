public class FoodOrderAbstraction {
    static abstract class FoodOrder { double food; FoodOrder(double food) { this.food = food; } abstract double calculateBill(); }
    static class DineInOrder extends FoodOrder { DineInOrder(double food) { super(food); } double calculateBill() { return food * 1.05; } }
    static class TakeAwayOrder extends FoodOrder { TakeAwayOrder(double food) { super(food); } double calculateBill() { return food + 25; } }
    public static void main(String[] args) { System.out.println("Dine-in: " + new DineInOrder(500).calculateBill()); System.out.println("Takeaway: " + new TakeAwayOrder(500).calculateBill()); }
}
