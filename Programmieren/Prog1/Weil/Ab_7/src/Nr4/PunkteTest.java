package Nr4;

public class PunkteTest {

    public static void main(String[] args){
        int hausarbeit = 5;
        int vortrag = 8;
        int summe = 0;
        summe = bewerten(hausarbeit, vortrag , summe);
        System.out.println("erreichte Punkte : " + summe);
    }

    public static int bewerten(int h, int v, int s){
        h = h * 3;
        v = v * 2;
        s = h + v;
        return s;
    }
}
