package planets;

import java.util.*;

public class Main {

    public static void adder(ArrayList<String> list, String a) {
        list.add(a);
    }

    public  static void remover(ArrayList<String> list,String a) {
        list.remove(a);
    }

    public  static void changer(ArrayList<String> list,String a,String b)
    {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext())
        {
            String next = iterator.next();
            if (next.equals(a)) {
                iterator.set(b);
            }
        }
    }

    public  static void shuffle(ArrayList<String> list)
    {
        Collections.shuffle(list);
    }

    public  static String randomPick(ArrayList<String> list)
    {
        Random rand = new Random();
        String randomElement = list.get(rand.nextInt(list.size()));
        return randomElement;
    }

    public  static  void indexShower(ArrayList<String> list,String a)
    {
        int retreival =list.indexOf(a);
        System.out.println("The planet is : "+ a + " and its index is : " + retreival);
    }

    public  static void finder(ArrayList<String> list,String a)
    {
        if (list.contains(a))
        {
            System.out.println( a + " is a planet and is listed:" + list);
        }
        else
        {
            System.out.println("The "+ a + " is not a planet");
        }
    }

    public static void main(String[] args)
    {
        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");

        List<String> solarSystem1 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth)));
        ArrayList<String> solarSystem2 = new ArrayList<>(Arrays.asList( mercury ,venus , mars, jupiter, earth));
        System.out.println(solarSystem1);
        System.out.println(solarSystem2);
        System.out.println("Adding a planet");
        adder(solarSystem2,"Pluto");
        System.out.println(solarSystem2);
        System.out.println("Removing a planet");
        remover(solarSystem2,"Pluto");
        System.out.println(solarSystem2);
        changer(solarSystem2,"mars","The Planet is Mars!");
        System.out.println(solarSystem2);
        shuffle(solarSystem2);
        System.out.println(solarSystem2);
        System.out.println("A random planet:");
        System.out.println(randomPick(solarSystem2));
        indexShower(solarSystem2,"earth");
        finder(solarSystem2,"Pluto");
    }
}