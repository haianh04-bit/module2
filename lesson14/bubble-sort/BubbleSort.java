public class BubbleSort {
    static int[] array = {9, 1, 4, 2, 8, 0, 3, 7, 6, 5};
    public static void bubbleSort(int[] array) {
        boolean needNextPass = true;
        int size = array.length - 1;
        for (int i = 0; i < size && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < size - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array);

        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
