package zadanie2;

public class FunkcjaLiniowa implements Wielomian {

    private double a = 0;
    private double b = 0;

    public FunkcjaLiniowa(double a, double b){

        this.a = a;
        this.b = b;

    }

    @Override
    public void wypiszMiejscaZerowe(){
        if(a == 0)
            System.out.println("brak");
        else
            System.out.println(-b / a);
    }
}
