package zadanie5;

import java.util.Objects;

class Wspolrzedna implements Comparable<Wspolrzedna> {

    private int x, y;

    public Wspolrzedna(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(Wspolrzedna w) {
        if(this.x <= w.x)
            if(this.y <= w.y)
                return this.x-w.x + this.y-w.y;
            else
                return this.y-w.y;
        else
            return this.x-w.x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wspolrzedna that = (Wspolrzedna) o;
        return x == that.x &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
