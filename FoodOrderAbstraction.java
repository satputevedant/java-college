abstract class FoodOrder {
    abstract void prepare();

    void message() {
        System.out.println("Food Order");
    }
}

class DineInOrder extends FoodOrder {
    @Override
    void prepare() {
        System.out.println("Preparing Dine-In Order");
    }
}

class TakeAwayOrder extends FoodOrder {
    @Override
    void prepare() {
        System.out.println("Preparing Take-Away Order");
    }
}

public class FoodOrderAbstraction {
    public static void main(String[] args) {
        DineInOrder dineIn = new DineInOrder();
        dineIn.message();
        dineIn.prepare();

        TakeAwayOrder takeAway = new TakeAwayOrder();
        takeAway.message();
        takeAway.prepare();
    }
}
