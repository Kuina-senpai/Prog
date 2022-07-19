package Nr1;

import java.util.NoSuchElementException;

public class MengeUtil {
    public static void merge(MengeGet a, MengeGet b) {
        // Bildet die Vereinigung von a und b, anschliessend ist a leer und b = Vereinigung
        // Idee:
        // sukzessive aus a ein Element entnehmen und in b einfuegen
        // bis a leer ist
        int tmp;
        while (a.size() != 0) {
            try {
                tmp = a.get();
                a.remove(tmp);
                b.insert(tmp);
            }
            catch(NoSuchElementException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static MengeGet union(MengeGet a, MengeGet b) throws NoSuchElementException, IllegalArgumentException {
        // liefert die Vereinigung
        // laesst a und b unveraendert
        MengeGet aKopie = a.clone();
        MengeGet bKopie = b.clone();
        merge(aKopie, bKopie);
        return bKopie;
    }

    public static void main(String[] args) {
        MengeGet a  = new BitvektorGet(100);
        MengeGet b = new MengeAlsArrayGet(100);
        MengeGet c;
        a.insert(5);
        a.insert(85);
        b.insert(85);
        for (int i = 1; i <= 10; i++)
            b.insert(90-i);

        System.out.println("a = " + a + " size: " + a.size());
        System.out.println("b = " + b + " size: " + b.size());
        c= union(b, a);
        System.out.println("nach union");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c + " size: " + c.size());
    }
}
