package resizeable;

public class Square implements Resizeable {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void resize(double percent) {
        this.size *= percent;
    }

    public String toString() {
        return "Square [size=" + this.size + "]";
    }
}