package zadanie6;

import java.util.HashMap;

public class Mapa {

    HashMap<String, Integer> map = new HashMap<>();
    private String keyTab[];
    int element = 0;
    private final int size;

    public Mapa(int size){
        this.size = size;
        keyTab = new String[size];
    }

    public int getSize() {
        return size;
    }

    public synchronized void wyslij(Object ob1, Object ob2) {

        map.put((String) ob2, (Integer) ob1);
        keyTab[element] = ((String) ob2);

        if(element == size - 1)
            element = 0;
        else
            element++;
    }

    public synchronized Object odbierz() {

        if(map.isEmpty())
            return null;

        Object ob = map.get(keyTab[element]);
        map.remove(keyTab[element]);

        if(element != size)
            element++;

        return ob;
    }
}
