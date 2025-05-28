import java.util.Scanner;

public class Triangle extends CheckTriangle {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập độ dài của ba cạnh của một tam giác:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập c: ");
        int c = scanner.nextInt();

        try {
            checkTriangle(a, b, c);
            System.out.println("Độ dài " + a + ", " + b + ", và " + c + " có thể tạo thành một hình tam giác.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        System.out.println("Kết thúc chương trình.");
    }
}
