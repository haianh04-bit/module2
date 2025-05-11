import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung lớn nhất");
        }
        while (a != b){
            if (a > b){
                a = a -b ;
            }else {
                b = b - a;
            }
            System.out.println("Ước chung lớn nhất: " + a);
        }
    }
}
