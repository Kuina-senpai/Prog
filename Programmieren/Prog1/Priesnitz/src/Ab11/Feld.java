package Ab11;

import java.util.Arrays;

public class Feld {
    public static int[] umkehren(int[] f){
        int[] neu = new int[f.length];
        for (int i = 0; i < f.length; i++){
            neu[i] = f[f.length - (i+1)];
        }
        return neu;
    }
    public static String umkehrenInPlace(int[] f){
        for (int i = 0; i < f.length/2; i++){
            //f.length/2, ansonsten wird doppelt getauscht, dies its gleich bedeutend mit kein mal tauschen
            // zum Verständnis sout die einzelnen zwischen werte
            int temp = f[i];
            f[i] = f[f.length - (i+1)];
            f[f.length - (i+1)] = temp;
        }
       return Arrays.toString(f);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(umkehrenInPlace(a));
    }
}
