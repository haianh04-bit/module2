import java.util.Scanner;

public class CalculationExample {
    void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y " + a);
            System.out.println("Hiệu x - y " + b);
            System.out.println("Tích x * y " + c);
            System.out.println("Thương x / y " + d);
        } catch (Exception e ){
            System.out.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }
}
