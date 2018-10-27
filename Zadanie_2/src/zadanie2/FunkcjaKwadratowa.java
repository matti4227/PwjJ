package zadanie2;

public class FunkcjaKwadratowa implements Wielomian {

    private double a = 0;
    private double b = 0;
    private double c = 0;

    public FunkcjaKwadratowa(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public void wypiszMiejscaZerowe(){

        double d = b*b - 4*a*c;

        if(d < 0)
            System.out.println("brak");
        else if(d == 0)
            System.out.println((-b)/2*a);
        else
            System.out.println(((-b) - Math.sqrt(d))/2*a + " " + (-b + Math.sqrt(d))/2*a);
    }
}
