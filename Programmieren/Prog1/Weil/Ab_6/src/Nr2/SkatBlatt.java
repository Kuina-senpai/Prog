package Nr2;


import java.util.Arrays;
import java.util.Random;

public class SkatBlatt {
    private String[] blatt = new String[32];
    private Karten[] stich = new Karten[3];

    private static final String[] farbe = {"Kreuz" , "Pik" , "Herz" , "karo"};
    private static final String[] werte = {"7","8","9","10","B","D","K","Ass"};


    public SkatBlatt(){
        int i = 0;
        while (i < 32){
            for (int a = 0; a < farbe.length; a++){
                for (int b = 0; b < werte.length; b++){
                    blatt[i] = farbe[a] + " " + werte[b];
                    i++;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "SkatBlatt{" +
                " blatt=" + Arrays.toString(blatt) +
                '}';
    }

    public void erzeugeStich(){
        Random a = new Random();
        for (int i = 0; i < stich.length; i++){
            int f = a.nextInt(4);
            int w = a.nextInt(8);
            stich[i] = new Karten(farbe[f],werte[w]);
        }
        System.out.println(Arrays.toString(stich));
    }

    public Karten[] getStich() {
        return stich;
    }

    public int zaehlen(){
        int stichwert = 0;
        for (int i = 0; i < stich.length; i++) {
            stichwert += stich[i].setzePunktwert();
        }
        return stichwert;
    }
    public static void main(String[] args) {
        SkatBlatt a = new SkatBlatt();
        //System.out.println(a.toString());
        a.erzeugeStich();
        System.out.println(a.zaehlen());
    }

}
