package Race;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of Threads you want to create: ");
        int n = input.nextInt();


        for (int x = 0; x < n; x++)
        {
            Runner temp = new Runner(x);
            temp.start();
        }
        //System.out.println(temp.Finish);
    }
}
