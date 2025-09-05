/*Write a Java program where one thread prints only even numbers and another prints only odd numbers from
1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).
 */

class NumberPrinter {

    private int number = 1;
    private final int MAX = 20;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                System.out.println("Odd Thread: " + number++);
                notify();
            } else {
                try { wait(); } catch (InterruptedException e) {}
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                System.out.println("Even Thread: " + number++);
                notify();
            } else {
                try { wait(); } catch (InterruptedException e) {}
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread odd = new Thread(() -> printer.printOdd());
        Thread even = new Thread(() -> printer.printEven());

        odd.start();
        even.start();
    }
}