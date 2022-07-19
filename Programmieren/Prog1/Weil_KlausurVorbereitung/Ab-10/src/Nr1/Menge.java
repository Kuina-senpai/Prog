package Nr1;

public interface Menge {
    // Nr1.Menge von ganzen Zahlen (int)
    int size();  // Anzahl der Elemente in der Nr1.Menge
    boolean contains(int n);  // prueft, ob n in M enthalten ist
    void insert(int n) ;  // fuegt n zu M hinzu (macht nichts, wenn n schon in M enthalten ist)
    void remove(int n); // entfernt n aus M (macht nichts, wenn n nicht in M enthalten ist)
}
