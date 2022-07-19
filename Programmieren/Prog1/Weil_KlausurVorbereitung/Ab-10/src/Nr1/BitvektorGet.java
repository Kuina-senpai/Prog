package Nr1;

import java.util.NoSuchElementException;

public class BitvektorGet extends Bitvektor implements MengeGet {
    public BitvektorGet(int max) {
        super(max);
    }

    public int get() throws NoSuchElementException {
        for (int i = 0; i < feld.length; i++) {
            if (feld[i])
                return i;
        }
        throw new NoSuchElementException("Nr1.Menge leer");
    }

    public MengeGet clone() {
        MengeGet neu = new BitvektorGet(feld.length);
        for(int i = 0; i < this.feld.length; i++) {
            if (feld[i])
                neu.insert(i);
        }
        return neu;
    }

}
