package zadanie2;

public class Rational{

    private int licznik = 0;
    private int mianownik = 0;

    public Rational(int licznik, int mianownik){

        this.licznik = licznik;
        this.mianownik = mianownik;

    }

    public Rational add(Rational arg){
        return new Rational(this.licznik*arg.mianownik+this.mianownik*arg.licznik, this.mianownik*arg.mianownik);
    }

    public Rational mul(Rational arg){
        return new Rational(this.licznik*arg.licznik, this.mianownik*arg.mianownik);
    }

    public Rational sub(Rational arg){
        return new Rational(this.mianownik*arg.licznik-this.licznik*arg.mianownik, this.mianownik*arg.mianownik);
    }

    public Rational div(Rational arg){
        return new Rational(this.mianownik*arg.licznik, this.licznik*arg.mianownik);
    }

    public boolean equals(Rational arg){
        return this.licznik*arg.mianownik == this.mianownik*arg.licznik;
    }

    public int compareTo(Rational arg){
        int firstNumber = this.licznik*arg.mianownik;
        int secondNumber = this.mianownik*arg.licznik;
        if(firstNumber == secondNumber)
            return 0;
        else if(firstNumber > secondNumber)
            return 1;
        else
            return -1;
    }

    public String toString(){
        return licznik + "/" + mianownik;
    }

}
