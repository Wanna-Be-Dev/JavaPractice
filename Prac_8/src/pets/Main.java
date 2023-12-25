package pets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Pet doggy=new Dog("Dowg",8);
        Pet kitten=new Cat("BigC",3);
        Pet owl=new Owl("Owely",15);

        HashMap<String,Pet> pets = new HashMap<>();

        pets.put("a",doggy);
        pets.put("b",kitten);
        pets.put("c",owl);
        System.out.println(pets.toString());

        System.out.println(pets.get("b").toString());

        Dog doggy1=new Dog("BigDowgy",6);
        Cat kitten1=new Cat("pu$$",1);

        pets.put("d",doggy1); //put  ->  d=Pet [name=BigDowgy,age=6]
        pets.put("b",kitten1);//change   b=Pet [name=BigC,age=3] -> b=Pet [name=pu$$,age=1]

        System.out.println(pets.toString());

        int[] mas=new int[10];
        for(int i=0;i<10;i++)
        {
            int a = (int) (Math.random()*(200+1)) ;;
            mas[i]=a;
            System.out.println(mas[i]);
        }
        int count=0;
        for(int q=0; q < mas.length;q++)
        {
            for(int y=q+1; y < mas.length ;y++)
            {
                if(mas[q]==mas[y])
                {
                    count+= 1;
                }
            }
        }
        System.out.println("count = "+count);
    }
}
