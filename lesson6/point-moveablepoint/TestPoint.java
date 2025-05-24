public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(2.5F, 3.3F);
        System.out.println(p);
        p.setXY(3.1F, 4.3F);
        float[] xy = p.getXY();
        System.out.println("x: " + xy[0] + ", y: " + xy[1]);
    }
}