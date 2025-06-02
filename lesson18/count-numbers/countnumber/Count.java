package countnumber;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "Luồng thực thi của tôi");
        System.out.println("Luồng của tôi đã được tạo ra: " + myThread);
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println("In ra số đếm " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Chỉ thị của tôi đã bị ngắt");
        }
        System.out.println("Luồng của tôi đã hoàn tất.");
    }
}
