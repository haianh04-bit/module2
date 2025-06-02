import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    public static void main(String[] args) {
        String filePath = "countries.csv";
        List<Country> countryList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String code = parts[1].replace("\"", "").trim();
                    String name = parts[2].replace("\"", "").trim();
                    Country country = new Country(id, code, name);
                    countryList.add(country);
                }
            }
            System.out.println("Danh sách các quốc gia:");
            for (Country country : countryList) {
                System.out.println(country);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
