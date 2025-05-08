import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        final double rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        double usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.printf("%.2f USD = %.0f VND\n", usd, vnd);
    }
}
