package zadanie6;

public class Main {

    public static void main(String[] args) {

//        NewJFrame jf = new NewJFrame();
//        jf.setVisible(true);

//        KolejkaKomunikatow k = new KolejkaKomunikatow();
//        Watek w1 = new WatekKolejki(k,1);
//        Watek w2 = new WatekKolejki(k,2);
//        w1.start();
//        w2.start();
//
//        try {
//            w1.join();
//            w2.join();
//        }catch(InterruptedException e) {}
//
//        Object ob = k.odbierz();
//
//        while(k != null) {
//            System.out.println(((Integer)ob).toString());
//            ob = k.odbierz();
//        }

        Mapa m = new Mapa(2);
        Watek w1 = new WatekMapy(m, 1, "Goblin Slayer - new chapter");
        Watek w2 = new WatekMapy(m, 2, "Shingeki no Kyojin - new episode");
        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
        }catch(InterruptedException e) {}

        Object ob = m.odbierz();

        while(m != null) {
            System.out.println(ob.toString());
            ob = m.odbierz();
        }
    }
}
