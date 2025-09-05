/*Implement a basic producer-consumer problem using wait() and notify().
        --->Producer thread should add items to a shared buffer.
        --->Consumer thread should remove items.
        Ensure the buffer size is limited to 5 items..*/
import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == LIMIT) wait();

        queue.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) wait();

        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            int i = 1;
            while (true) {
                try {
                    buffer.produce(i++);
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    buffer.consume();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}