package circle;

public class Circle {
    private double radius = (double)1.0F;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius;
    }

    public double getPerimeter() {
        return (double)2.0F * this.radius;
    }

    public String toString() {
        double var10000 = this.getRadius();
        return "circle.comparable.comparator.Circle [radius=" + var10000 + ", color=" + this.getColor() + ", area=" + this.getArea() + ", perimeter=" + this.getPerimeter() + "]";
    }
}
