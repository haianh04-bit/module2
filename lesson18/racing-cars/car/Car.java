import java.util.Random;

public class Car implements Runnable{
    private String name;

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        While (runDistance < DISTANCE) {
           try {
               int speed = (new Random()).nextInt(20);
               runDistance += speed;
               String log = "|";
               int percent = (runDistance * 100) / DISTANCE;
               for (int i = 0; i < DISTANCE; i+= step) {
                   if (percent >= i + step) {
                          log += "=";
                     } else if (percent >= i && percent < i + step) {
                          log += "o";
                     } else {
                          log += "-";
                   }
               }
                log += "| ";
               System.out.println("car" + this.name + " : " + log + " " + Math.min (runDistance, DISTANCE) + "m/" + DISTANCE + "KM");
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               System.out.println("Car " + this.name + " broken");
               break;
           }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " finished in " + (endTime - startTime) / 1000 + "s");
    }
}
