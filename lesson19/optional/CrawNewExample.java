import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawNewExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z"); // đọc toàn bộ nội dung
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", " "); // Loại bỏ các dòng mới
            Pattern pattern = Pattern.compile("<h3 class=\"article-title\">(.*?)</h3>");
            Matcher matcher = pattern.matcher(content);
            System.out.println("Danh sách tiêu đề bài viết:");
            while (matcher.find()) {
                System.out.println("• " + matcher.group(1).trim());
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc trang: " + e.getMessage());
        }
    }
}
