package runable;

public class Main {
    public static void main(String[] args) {
        System.out.println("car.Main thread running...");
        RunnableDemo runnableDemo = new RunnableDemo("thread.Thread-1-HR-Database");
        runnableDemo.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("thread.Thread-2-Send-Email");
        runnableDemo2.start();
        System.out.println("car.Main thread stopped!!!");
    }
}
