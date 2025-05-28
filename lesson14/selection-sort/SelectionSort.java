public class SelectionSort {
    static double[] list = {5.4, 3.2, 1.5, 4.8, 2.9 ,1, 9};
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void main(String[] args) {
        System.out.print("Mảng ban đầu: ");
        for (double v : list) {
            System.out.print(v + " ");
        }
        System.out.println();

        selectionSort(list);

        System.out.print("Mảng sau khi sắp xếp: ");
        for (double v : list) {
            System.out.print(v + " ");
        }
    }
}
