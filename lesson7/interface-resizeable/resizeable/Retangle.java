package resizeable;

public class Retangle implements Resizeable {
    private double width;
    private double height;

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (double)2.0F * this.width + (double)2.0F * this.height;
    }

    public void resize(double percent) {
        this.width *= percent / (double)100.0F;
        this.height *= percent / (double)100.0F;
    }

    public String toString() {
        return "Retangle [width=" + this.width + ", height=" + this.height + "]";
    }
}