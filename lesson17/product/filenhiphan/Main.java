package filenhiphan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductTest productTest = new ProductTest();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo tên");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới sau khi nhập số
            switch (choice) {
                case 1:
                    productTest.addProduct(scanner);
                    break;
                case 2:
                    productTest.displayProducts();
            }
        } while (choice != 0);

    }
}
