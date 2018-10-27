package zadanie6;

public class WatekMapy extends Watek {

    private Mapa mapa;
    private String komunikat;
    private final int size;

    public WatekMapy(Mapa m, int pocz, String komunikat) {
        super(pocz);
        mapa = m;
        size = mapa.getSize();
        this.komunikat = komunikat;
    }

    @Override
    public void run() {
        try {
            for(int i = istart; i<=size; i+=2) {
                mapa.wyslij(new Integer(i), new String(komunikat));
                Thread.sleep(50);
            }
        }catch(InterruptedException e) {}
    }
}