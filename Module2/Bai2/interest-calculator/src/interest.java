import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double increstRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền cho vay: ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi ");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất: ");
        increstRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (increstRate/100)/ 12 * month;
        }
        System.out.println("Tổng số tiền lãi: " + totalInterest);
    }
}
