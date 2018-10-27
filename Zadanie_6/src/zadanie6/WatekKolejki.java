package zadanie6;

public class WatekKolejki extends Watek {

    private KolejkaKomunikatow koko;

    public WatekKolejki(KolejkaKomunikatow kk, int pocz) {
        super(pocz);
        koko = kk;
    }

    @Override
    public void run() {
        try {
            for(int i = istart; i<=10; i+=2) {
                koko.wyslij(new Integer(i));
                Thread.sleep(50);
            }
        }catch(InterruptedException e) {}

    }
}
