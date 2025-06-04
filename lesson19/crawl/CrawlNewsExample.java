import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNewsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-thao/uefa-doi-luat-o-champions-league-sau-khi-psg-vo-dich-20250603090508662.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z"); // đọc toàn bộ nội dung
            String content = scanner.next();
            scanner.close();

            content = content.replaceAll("\\n+", " ");

            Pattern p = Pattern.compile("<p>(.*?)</p>");
            Matcher m = p.matcher(content);
            System.out.println(" Nội dung bài viết:");
            while (m.find()) {
                System.out.println("• " + m.group(1));
            }
        } catch (IOException e) {
            System.out.println(" Lỗi khi đọc trang: " + e.getMessage());
        }
    }
}


