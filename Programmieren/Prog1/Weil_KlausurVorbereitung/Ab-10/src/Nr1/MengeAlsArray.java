package Nr1;

public class MengeAlsArray {
    // Instanzattribute
    protected int[] feld;
    protected int size;

    // Konstruktor
    public MengeAlsArray(int laenge) {
        feld = new int[laenge];
        this.size = 0;
    }

    // Instanzmethoden

    public int size() {
        return size;
    }

    public boolean contains(int n) {
        for(int i = 0; i < size; i++)
            if (feld[i] == n)
                return true;
        return false;
    }
    public void insert(int n) throws IllegalArgumentException {
        if(!contains(n)) {
            if(size >= feld.length) {
                throw new IllegalArgumentException(n + " kann nicht eigefuegt werden");
            }
            feld[size]= n;
            size++;
        }
    }


    public void remove(int n) {
        if(!contains(n))
            return;
        // Position des Elementes n suchen:
        int i = 0;
        while(feld[i] != n) {
            i++;
        }
        // jetzt ist i die Positionsnr des Elementes n
        // alle nachfolgenden Elemente eine Position nach vorne schieben:
        for(int j = i+1; j < size; j++)
            feld[j-1] = feld[j];
        size--;
    }

    public String toString() {
        String s = "{";
        for (int i = 0; i < size; i++)
            s = s+ feld[i] + ", ";
        s = s + "}";
        return s;
    }

    public int getN() {
        return feld.length;
    }
}
