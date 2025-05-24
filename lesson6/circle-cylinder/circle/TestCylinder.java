package circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder((double)3.0F, (double)2.5F, "blue");
        System.out.println(cylinder);
    }
}