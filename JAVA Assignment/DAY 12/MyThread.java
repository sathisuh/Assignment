/*Write a Java program to demonstrate multithreading by extending the Thread class.
        --->Create a class MyThread that extends Thread.
        --->Override the run() method to display the thread name and a message
         five times with a delay of 500 milliseconds between prints.

--->In the main() method, create two objects of MyThread and start them.
        --->Each thread prints its message independently, showing concurrent execution.*/

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Message " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}