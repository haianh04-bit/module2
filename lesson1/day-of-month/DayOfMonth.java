import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bạn muốn đếm ngày vào tháng nào? ");
        int month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.print("Tháng '2' có 28 hoặc 29 ngày!\n");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng '" + month + "' sẽ có 31 ngày!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng '" + month + "' sẽ có 30 ngày!");
                break;
        }
    }
}
