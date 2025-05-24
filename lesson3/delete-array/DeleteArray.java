import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {3, 5, 7, 2, 9, 5, 8};
        int N = array.length;

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập phần tử X cần xoá: ");
        int X = scanner.nextInt();

        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        } else {
            System.out.println("Phần tử " + X + " xuất hiện tại vị trí index = " + index_del);

            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--;

            System.out.print("Mảng sau khi xoá: ");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
