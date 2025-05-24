package resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable circle = new Circle((double)5.0F);
        Resizeable retangle = new Retangle(3.3, 4.4);
        Resizeable square = new Square((double)5.0F);
        System.out.println("Before Resize: ");
        System.out.println(circle);
        System.out.println(retangle);
        System.out.println(square);
        circle.resize((double)50.0F);
        retangle.resize((double)100.0F);
        square.resize((double)150.0F);
        System.out.println("After Resize: ");
        System.out.println(circle);
        System.out.println(retangle);
        System.out.println(square);
    }
}