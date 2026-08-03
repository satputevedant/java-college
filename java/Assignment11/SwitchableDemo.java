public class SwitchableDemo {
    interface Switchable { void turnOn(); }
    static class Light implements Switchable { public void turnOn() { System.out.println("Light is on"); } }
    static class Fan implements Switchable { public void turnOn() { System.out.println("Fan is on"); } }
    public static void main(String[] args) { new Light().turnOn(); new Fan().turnOn(); }
}
