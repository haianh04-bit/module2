package circle;

public class Cylinder extends Circle {
    private double height = (double)1.0F;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * this.getRadius() * this.getRadius() * this.height;
    }

    public String toString() {
        double var10000 = this.height;
        return "Cylinder height: " + var10000 + " volume: " + this.getVolume() + ", Which is a subclass of " + super.toString();
    }
}
