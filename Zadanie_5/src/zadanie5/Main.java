package zadanie5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    private static void wypiszElementy(TreeSet zbior) {

        Iterator it = zbior.iterator();

        while(it.hasNext()) {
            System.out.println((it.next()).toString());
        }
    }

    public static void main(String[] args) {
//        TreeSet zbior = new TreeSet();
//        zbior.add(new Wspolrzedna(2,3));
//        zbior.add(new Wspolrzedna(-3,0));
//        zbior.add(new Wspolrzedna(-1,2));
//        zbior.add(new Wspolrzedna(-1,2));
//        zbior.add(new Wspolrzedna(-3,-2));
//        zbior.add(new Wspolrzedna(4,-1));
//        zbior.add(new Wspolrzedna(0,0));
//        zbior.add(new Wspolrzedna(6,7));
//        zbior.add(new Wspolrzedna(-2,-2));
//        zbior.add(new Wspolrzedna(-2,-3));
//        zbior.add(new Wspolrzedna(-2,0));
//        zbior.add(new Wspolrzedna(0,-3));
//        wypiszElementy(zbior);

//        HashMap mapa = new HashMap();
//        mapa.put(new Wspolrzedna(2,3), new String("czerwony"));
//        mapa.put(new Wspolrzedna(-3,0), new String("czarny"));
//        mapa.put(new Wspolrzedna(-1,2), new String("czerwony"));
//        mapa.put(new Wspolrzedna(2,-1), new String("czarny"));
//        Wspolrzedna w = new Wspolrzedna(2,-1);
//        System.out.println("Punkt " + w.toString()+ " ma kolor " + mapa.get(w));

        Graf g = new Graf("4, (0,1), (1,2), (3,0), (1,3)");
        System.out.println(g.toString());
    }
}
