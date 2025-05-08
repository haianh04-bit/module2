import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("LinearEquationResolver");
        System.out.println("Given a equation as'a * x + b = c', please enter constants");
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        if (a !=0) {
            double answer = (c - b)/ a;
            System.out.printf("Chuyển phương trình với x = %f!\n", answer);
        } else {
            if (b == c){
                System.out.print("Đáp án là x!");
            } else {
                System.out.print("Không có giải pháp!");
            }
        }
    }
}
