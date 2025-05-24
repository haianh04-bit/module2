import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5};
        int N = array.length;

        int[] newArray = new int[N + 1];

        System.out.print("Nhập số cần chèn X: ");
        int X = scanner.nextInt();

        System.out.print("Nhập vị trí index cần chèn X vào mảng: ");
        int index = scanner.nextInt();

        if (index < 0 || index > N) {
            System.out.println("Không chèn được phần tử vào mảng. Vị trí không hợp lệ.");
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }

            newArray[index] = X;

            for (int i = index; i < N; i++) {
                newArray[i + 1] = array[i];
            }

            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
