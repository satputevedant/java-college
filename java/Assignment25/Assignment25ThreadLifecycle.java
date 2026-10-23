/** Assignment 25: multiple Thread subclasses and lifecycle states. */
public class Assignment25ThreadLifecycle {

    static class NumberThread extends Thread {

        NumberThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int number = 1; number <= 10; number++) {
                System.out.println(getName() + ": " + number);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException exception) {
                    interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NumberThread firstThread = new NumberThread("Thread-A");
        NumberThread secondThread = new NumberThread("Thread-B");

        System.out.println("Before start: " + firstThread.getState());
        firstThread.start();
        secondThread.start();
        System.out.println("After start: " + firstThread.getState());

        firstThread.join();
        secondThread.join();
        System.out.println("After join: " + firstThread.getState());
    }
}
