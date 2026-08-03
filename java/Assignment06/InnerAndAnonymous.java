public class InnerAndAnonymous {
    private String vehicle = "Electric Scooter";
    class Details { void show() { System.out.println("Vehicle: " + vehicle); } }
    interface Action { void perform(); }
    public static void main(String[] args) {
        InnerAndAnonymous app = new InnerAndAnonymous();
        app.new Details().show();
        Action action = new Action() { public void perform() { System.out.println("Vehicle is moving"); } };
        action.perform();
    }
}
