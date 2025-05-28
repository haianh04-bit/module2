import java.util.Scanner;

public class CalculationExampleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }
}
