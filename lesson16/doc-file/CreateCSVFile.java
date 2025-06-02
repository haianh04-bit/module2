import java.io.FileWriter;
import java.io.IOException;

public class CreateCSVFile {
    public static void main(String[] args) {
        String filePath = "countries.csv";

        String data = """
                1 ,"AU", "Australia"
                2 ,"CN", "China"
                3 ,"FR", "France"
                4 ,"DE", "Germany"
                5 ,"IN", "India"
                6 ,"JP", "Japan"
                7 ,"KR", "South Korea"
                8 ,"RU", "Russia"
                9 ,"US", "United States"
                10,"VN", "Vietnam"
                """;

        try(FileWriter fw = new FileWriter(filePath)) {
            fw.write(data);
            System.out.println("File countries.cvs đã được tạo thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo file: " + e.getMessage());
        }

    }
}
