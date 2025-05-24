public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint p = new MoveablePoint(1.0F, 2.0F, 3.0F, 4.0F);
        System.out.println("MoveablePoint: " + String.valueOf(p));
        System.out.println("xSpeed: " + p.getXSpeed());
        System.out.println("ySpeed: " + p.getYSpeed());
        p.setSpeed(0.5F, 1.0F);
        System.out.println("MoveablePoint: " + String.valueOf(p));
        float[] speed = p.getSpeed();
        System.out.println("xSpeed: " + speed[0] + ", ySpeed: " + speed[1]);
        p.move();
        System.out.println("After move 1: " + String.valueOf(p));
        p.move();
        System.out.println("After move 2: " + String.valueOf(p));
    }
}