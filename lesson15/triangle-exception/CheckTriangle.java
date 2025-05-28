public class CheckTriangle  {
    public static void checkTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Các cạnh phải là số dương.");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Tổng của hai cạnh bất kỳ phải lớn hơn cạnh thứ ba.");
        }
    }
}
