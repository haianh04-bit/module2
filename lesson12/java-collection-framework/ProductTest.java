import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm theo ID");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp tăng dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            String input = sc.nextLine();
            choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    manager.addProduct(sc);
                    break;

                case 2:
                    manager.editProduct(sc);
                    break;

                case 3:
                    manager.deleteProduct(sc);
                    break;
                case 4:
                    manager.displayProducts();
                    break;
                case 5:
                    manager.searchProductByName(sc);
                    break;
                case 6:
                    manager.sortByPriceDescending();
                    System.out.println("Đã sắp xếp tăng dần");
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                default:
                    System.out.println("Chức năng không hợp lệ, vui lòng chon lại");
            }
        } while (true);
    }
}
