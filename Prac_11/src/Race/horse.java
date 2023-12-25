package Race;

import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;



class Runner extends Thread {
    int id;
    public Runner(int id)
    {
       this.id = id;
    }
    @Override
    public synchronized void run(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(new Random().nextInt(4000));

            }catch(Exception err)
            {
                System.out.println("error");
            }
        }
        System.out.println("The horse №: "+ (id+1) + " had finished the race!");
    }
}
