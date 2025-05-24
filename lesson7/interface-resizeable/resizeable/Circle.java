package resizeable;

public class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return (Math.PI * 2D) * this.radius;
    }

    public void resize(double percent) {
        this.radius *= percent;
    }

    public String toString() {
        return "Circle [radius=" + this.radius + "]";
    }
}