package zadanie3;

public class Dzialanie extends Wierzcholek {

    private char op;

    public Dzialanie(char znak) {
        op = znak;
    }

    public void dodajLewyArg(Wierzcholek arg) {
        lewy = arg;
    }

    public void dodajPrawyArg(Wierzcholek arg) {
        prawy = arg;
    }

    public int wartosc() throws StringIndexOutOfBoundsException, ArithmeticException{

        switch (op) {
            case '+':
                return lewy.wartosc() + prawy.wartosc();
            case '-':
                return lewy.wartosc() - prawy.wartosc();
            case '/':
                return lewy.wartosc() / prawy.wartosc();
            case '*':
                return lewy.wartosc() * prawy.wartosc();
        }
        return  0;
    }
}