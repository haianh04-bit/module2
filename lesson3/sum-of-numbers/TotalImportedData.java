import java.util.Scanner;

public class TotalImportedData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Nhập chỉ số cột muốn tính tổng (bắt đầu từ 0): ");
        int column = scanner.nextInt();

        // Kiểm tra chỉ số cột hợp lệ
        if (column < 0 || column >= cols) {
            System.out.println("Chỉ số cột không hợp lệ.");
            return;
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][column];
        }

        System.out.println("Tổng của cột " + column + " là: " + sum);
    }
}
