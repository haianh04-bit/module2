import java.util.Scanner;

public class LapYearCoculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year ;
        System.out.print("Nhập một năm: ");
        year = sc.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.printf("%d Là năm nhuận", year);
                } else {
                    System.out.printf("%d Không là năm nhuận", year);
                }
            } else {
                System.out.printf("%d Là năm nhuận", year);
            }
        } else {
            System.out.printf("%d Không là năm nhuận", year);
        }
    }
}
