/*Write a Java program to create a thread using the Runnable interface.
        --->Create a class TaskRunner that implements Runnable.
        --->Inside the run() method, print the current thread name and a
    task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
        --->The console should reflect the concurrent execution of both tasks.*/

class TaskRunner implements Runnable {
    private String taskName;

    public TaskRunner(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + taskName + " - Iteration " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted: " + e);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TaskRunner("Download Task"));
        Thread t2 = new Thread(new TaskRunner("Upload Task"));

        t1.start();
        t2.start();
    }
}