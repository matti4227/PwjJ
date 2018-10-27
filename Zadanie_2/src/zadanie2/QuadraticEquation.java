package zadanie2;

public class QuadraticEquation {

    private int a = 0;
    private int b = 0;
    private int c = 0;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int calculateY(int x){
        return a*x*x + b*x + c;
    }

    public int delta(){
        int d = b*b - 4*a*c;
        if(d == 0)
            return 1;
        else if(d < 0)
            return 0;
        else
            return 2;
    }


}
