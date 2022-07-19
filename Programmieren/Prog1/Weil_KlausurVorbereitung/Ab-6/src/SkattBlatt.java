import java.util.Arrays;
import java.util.Random;

public class SkattBlatt {

    private Karte[] blatt = new Karte[32];
    private Karte[] stich = new Karte[3];

    private static final String[] farbe = {"Kreuz" , "Pik" , "Herz" , "karo"};
    private static final String[] werte = {"7","8","9","10","B","D","K","Ass"};

    public SkattBlatt(){
        for (int i = 0; i < blatt.length;){
            for (int a = 0; a < farbe.length; a++){
                for (int b = 0; b < werte.length; b++){
                    blatt[i] = new Karte(farbe[a], werte[b]);
                    i++;
                }
            }
        }
    }
    public void erzeugeStich(){
        Random r = new Random();
        int i = 0;
        while(i < 3){
            int a = r.nextInt(0,32);
            stich[i] = blatt[a];
            i++;
        }
        System.out.println(Arrays.toString(stich));
    }
    public int zaehlen(){
        int a = 0;
        for (int i = 0; i < stich.length; i++){
            a += stich[i].punktwert();
        }
        return a;
    }
    public String toString(){
        /*for (int i = 0; i < blatt.length; i++){
            System.out.println(blatt[i]);
        }
        return "";**/
        return Arrays.toString(blatt);
    }

    public static void main(String[] args) {
        SkattBlatt a = new SkattBlatt();
        System.out.println(a.toString());
        a.erzeugeStich();

    }
}
