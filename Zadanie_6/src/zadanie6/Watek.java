package zadanie6;

public abstract class Watek extends Thread {

    protected int istart;

    public Watek(int pocz) {
        istart = pocz;
    }

    public abstract void run();
}