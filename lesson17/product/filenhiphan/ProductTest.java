package filenhiphan;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  ProductTest {
    static final String FILE_NAME = "products.txt";
    private List<Product> products;
    public ProductTest() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Scanner scanner)  {
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(System.console().readLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = System.console().readLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(System.console().readLine());
        System.out.println("Nhập hãng sản phẩm: ");
        String manufacturer = System.console().readLine();
        System.out.println("Nhập mô tả sản phẩm: ");
        String description = System.console().readLine();
        Product product = new Product(id, name, price, manufacturer, description);
        products.add(product);
        System.out.println("Sản phẩm đã được thêm thành công!");
    }
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào để hiển thị.");
            return;
        }
        System.out.println("Danh sách sản phẩm:");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
