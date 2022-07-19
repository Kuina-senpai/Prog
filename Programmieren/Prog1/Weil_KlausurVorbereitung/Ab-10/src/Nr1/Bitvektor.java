package Nr1;

public class Bitvektor {

    // Nr1.Menge als boole'sches Array

    private int max; // definiert den zulaessigen Zahlenbereich 0,... , (max-1)
    protected boolean[] feld;

    // Konstruktoren
    public Bitvektor(int max) {
        this.max = max;
        this.feld = new boolean[max];
    }

    // Instanzmethoden

    public boolean contains(int n) {
        if(n < 0 || n >= max)
            return false;
        return feld[n];
    }


    public void insert(int n) throws IllegalArgumentException {
        if(n < 0 || n >= max)
            throw new IllegalArgumentException("unzulaessiger Wert");
        feld[n] = true;
    }


    public void remove(int n) {
        if(n < 0 || n >= max)
            return;
        feld[n] = false;
    }


    public int size() {
        int size = 0;
        for(int i = 0; i < feld.length; i++)
            if(feld[i])
                size++;
        return size;
    }

    public String toString() {
        String s = "{ ";
        for(int i = 0; i < feld.length; i++)
            if(feld[i])
                s = s + i + ", ";
        s = s + "}";
        return s;
    }

    public int getN() {
        return max;
    }
}
