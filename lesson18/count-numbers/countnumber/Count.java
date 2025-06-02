public class Count implements Runnable {
    private Thread myThread;

    public Count(String name) {
        myThread = new Thread(this, "My runnable thread");
        System.out.println("My thread created: " + myThread);
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000); // Sleep for 100 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted" );
        }
        System.out.println("Main thread run is over");
    }
}
