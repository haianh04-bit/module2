import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước:: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Nhập " + array.length + " giá trị:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng đầu vào của bạn:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nBắt đầu xử lý sắp xếp... ");
        bubbleSortByStep(array);
    }
    public static void bubbleSortByStep(int[] array) {
        boolean needNextPass = true;
        for (int k = 1; k < array.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false){
                System.out.println("Mảng có thể được sắp xếp và không cần lần duyệt tiếp theo.");
                break;
            }
            System.out.println("Liệt kê sau\n " + k + "loại: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println();
        }
    }
}
