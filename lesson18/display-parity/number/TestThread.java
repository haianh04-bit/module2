package number;

public class TestThread {
    public static void main(String[] args) {
        Thread oddThread = new OddThread();
        Thread evenThread = new EvenThread();
        try {
            oddThread.start();
            oddThread.join();
            evenThread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
