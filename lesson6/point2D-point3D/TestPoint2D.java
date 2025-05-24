public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p = new Point2D(3.0F, 4.0F);
        System.out.println(p);
        p.setXY(1.1F, 2.2F);
        float[] xy = p.getXY();
        System.out.println("Point2D getXY: [" + xy[0] + ", " + xy[1] + "]");
    }
}