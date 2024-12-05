

class SharedResource {
    private int count = 0;

    // Synchronized method to increment the count
    public  synchronized void increment() {
        count++;
    }

    // Synchronized method to get the current count
    public synchronized int getCount() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        // Creating an instance of the shared resource
        SharedResource sharedResource = new SharedResource();

        // Creating Thread 1 to increment the count
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                sharedResource.increment();
            }
        });

        // Creating Thread 2 to increment the count
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                sharedResource.increment();
            }
        });

        // Starting both threads
        thread1.start();
        thread2.start();

        // Waiting for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the final count
        System.out.println("Final Count: " + sharedResource.getCount());
    }
}
