import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Scanner sc) {

        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(name, price);
        products.add(product);
    }


    public void editProduct(Scanner sc) {
        System.out.print("Nhập ID sản phẩm cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());

        for (Product product : products) {
            if (product.getId() == id) {
                System.out.print("Nhập tên mới: ");
                String newName = sc.nextLine();
                System.out.print("Nhập giá mới: ");
                double newPrice = Double.parseDouble(sc.nextLine());

                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Đã cập nhật sản phẩm.");
                return;
            }
        }

        System.out.println(" Không tìm thấy sản phẩm với ID: " + id);
    }


    public void deleteProduct(Scanner sc) {
        System.out.print("Nhập ID sản phẩm cần xoá: ");
        int id = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                System.out.println("Đã xoá sản phẩm.");
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm với ID: " + id);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }

        System.out.printf("%-5s %-20s %-10s\n", "ID", "Tên", "Giá");
        for (Product product : products) {
            System.out.printf("%-5d %-20s %-10.2f\n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void searchProductByName(Scanner sc) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println(" Không tìm thấy sản phẩm nào.");
        }
    }

    public void sortByPriceDescending() {
        Collections.sort(products, new ProductPriceComparator());
    }

}
