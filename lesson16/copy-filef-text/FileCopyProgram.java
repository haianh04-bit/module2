import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        if (!sourceFile.exists()){
            System.out.println("Tập tin nguồn không tồn tại.");
            return;
        }
        if(targetFile.exists()) {
            System.out.print("Tập tin đích đã tồn tại.");
            return;
        }
        int charCount = 0;
        try (FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(targetFile)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
                charCount++;
            }
            System.out.println("Sao chép hoàn tất.");
            System.out.println("Số ký tự đã sao chép: " + charCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tập tin: " + e.getMessage());
        }
    }
}
