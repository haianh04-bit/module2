package countnumber;

public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Luồng chính sẽ tồn tại cho đến khi luồng con còn tồn tại.");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Luồng chính bị gián đoạn.");
        }
        System.out.println("Chạy luồng chính đã hoàn thành.");
    }
}
