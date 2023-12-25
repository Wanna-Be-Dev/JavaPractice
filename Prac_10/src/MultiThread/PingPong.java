package MultiThread;
import java.lang.Object;
import java.util.Random;

class Ping extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            // from 0 to 4 milli sec
            //try { Thread.sleep(new Random().nextInt(4000));} random sleep
            try { Thread.sleep(3L*1000L);}
            catch (InterruptedException e) { }
            System.out.println("ping");
        }
    }
}
class Pong extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            // 0 to 4000 milli sec (3L * 1000L)
            //try { Thread.sleep(new Random().nextInt(4000)); }  random sleep
            try { Thread.sleep(4L*1000L);}
            catch (InterruptedException e) { }
            System.out.println("pong");
        }
    }
}


