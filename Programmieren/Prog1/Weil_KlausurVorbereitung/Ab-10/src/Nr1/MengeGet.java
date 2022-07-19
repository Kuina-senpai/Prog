package Nr1;

import java.util.NoSuchElementException;

public interface MengeGet extends Menge{
    int get() throws NoSuchElementException; // liefert ein Element der Nr1.Menge (falls diese nicht leer), ohne es zu entfernen

    MengeGet clone(); // liefert eine Kopie der Nr1.Menge
}
