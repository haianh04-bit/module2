import java.util.Scanner;

public class PrintShapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông(cạnh ở trên)");
            System.out.println("3. In tam giác vuông(cạnh ở dưới)");
            System.out.println("4. In tam giác cân");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài: ");
                    int x = in.nextInt();
                    System.out.println("Nhập chiều rộng: ");
                    int y = in.nextInt();
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < y; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều dài: ");
                    int h1 = in.nextInt();
                    for (int i = 1; i <= h1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều dài: ");
                    int h2 = in.nextInt();
                    for (int i = h2; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Nhập chiều dài: ");
                    int h3 = in.nextInt();
                    for (int i = 1; i <= h3; i++) {
                        for (int j = 1; j <= h3 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. ");
            }
        } while (choice != 0);
    }
}
