/*Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the
counter 1000 times. Use synchronization to avoid race conditions and display the final value.
 */

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SharedCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start(); t2.start(); t3.start();

        try {
            t1.join(); t2.join(); t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}