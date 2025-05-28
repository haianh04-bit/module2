import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExampleTest {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nVui lòng nhập chỉ số phần tử bất kỳ : ");
        int index = scanner.nextInt();
        try {
            System.out.println("Phần tử tại chỉ số " + index + " là: " + array[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng. Vui lòng nhập lại.");
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            System.out.println("Kết thúc chương trình.");
        }
    }
}
