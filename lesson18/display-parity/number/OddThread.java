package number;

public class OddThread extends Thread {


    @Override
    public void run(){
        for(int i = 1; i <= 10; i += 2){
            System.out.println("Số lẻ: " + i);
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
