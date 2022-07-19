package Nr1;

import java.util.NoSuchElementException;

public class MengeAlsArrayGet extends MengeAlsArray implements MengeGet {
    public MengeAlsArrayGet(int laenge) {
        super(laenge);
    }

    @Override
    public int get() throws NoSuchElementException {
        if (this.size == 0)
            throw new NoSuchElementException("Nr1.Menge leer");
        return feld[0];
    }

    @Override
    public MengeGet clone() {
        MengeGet neu = new MengeAlsArrayGet(feld.length);
        for(int i = 0; i < this.size; i++) {
            neu.insert(feld[i]);
        }
        return neu;
    }
}
