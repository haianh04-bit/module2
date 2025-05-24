public class TestPoint3D {
    public static void main(String[] args) {
        Point3D p = new Point3D(5.5F, 6.6F, 7.7F);
        System.out.println("Point3D: " + String.valueOf(p));
        p.setXYZ(9.9F, 8.8F, 7.7F);
        float[] xyz = p.getXYZ();
        System.out.println("Point3D getXYZ: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");
    }
}

