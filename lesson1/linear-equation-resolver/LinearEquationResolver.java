import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Bộ giải phương trình tuyến tính");
        System.out.println("Cho phương trình như sau 'a * x + b = c', vui lòng nhập hằng số: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Chuyển phương trình với x = %f!", answer);
        } else {
            if (b == c) {
                System.out.print("Đáp án là x!");
            } else {
                System.out.print("Không có giải pháp!");
            }
        }
    }
}
