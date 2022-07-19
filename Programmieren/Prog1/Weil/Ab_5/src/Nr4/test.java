package Nr4;

import static Nr4.Spiel.simplesSpiel;

public class test {
    public static void main(String[] args) {
        Spieler a = new Spieler("");
        Spieler b = new Spieler("");
        simplesSpiel(a,b);

        Spieler aa = new Spieler("Fabian");
        Spieler bb = new Spieler("Lukas");
        //einsGewinnt(aa,bb);

        Spieler c = new Spieler("Fabian");
        Spieler d = new Spieler("Lukas");
        //pasch6(c,d);

        Spieler i = new Spieler("Lukas");
        //grosseHausnummer(i);
    }
}