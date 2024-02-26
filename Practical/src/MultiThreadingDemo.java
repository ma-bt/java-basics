//15.	Write a program to demonstrate multithreading using both Thread class and Runnable interface.

// Example using Thread class
class ThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Example: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Example using Runnable interface
class RunnableExample implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Example: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class MultiThreadingDemo {
    public static void main(String[] args) {
        // Example using Thread class
        ThreadExample threadExample = new ThreadExample();
        threadExample.start(); // Starts a new thread

        // Example using Runnable interface
        RunnableExample runnableExample = new RunnableExample();
        Thread thread = new Thread(runnableExample);
        thread.start(); // Starts another new thread

        // Main thread (executed by the main method)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
