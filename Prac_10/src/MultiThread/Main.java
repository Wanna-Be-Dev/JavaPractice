package MultiThread;
import java.lang.Object;

public class Main{
    public static void main(String[] args) {
        System.out.println("Start of main thread");
        Thread ping = new Ping();
        Thread pong = new Pong();
        ping.start();   // sync
        pong.start();  // sync
        System.out.println("End of main thread");
    }
}