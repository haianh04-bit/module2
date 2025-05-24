package circle;

public class TestCricle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle((double)3.5F, "blue");
        System.out.println(circle);
    }
}