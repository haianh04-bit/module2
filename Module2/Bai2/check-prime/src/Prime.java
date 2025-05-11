import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " Không phải là số nguyên.");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " Là số nguyên");
            } else {
                System.out.println(number + " Không phải là số nguyên");
            }
        }
    }
}
