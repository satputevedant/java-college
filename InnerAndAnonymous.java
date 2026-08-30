public class InnerAndAnonymous {
    private String message = "Inner class accessed outer class data";

    class InnerMessage {
        void show() {
            System.out.println(message);
        }
    }

    interface Greeting {
        void greet();
    }

    public static void main(String[] args) {
        InnerAndAnonymous outer = new InnerAndAnonymous();
        InnerMessage inner = outer.new InnerMessage();
        inner.show();

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class");
            }
        };
        greeting.greet();
    }
}
