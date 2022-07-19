package Nr3;

import java.util.Arrays;
import java.util.Random;

public class IntArrayUtil {

    public static String toString(int[] a) {
        return Arrays.toString(a);
    }
    public static boolean areEqual(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true; //wenn die Schleife beendet wurde ohne false → true
        }
        return false;
    }

    public static void createSequence(int n) {
        int[] a;
        if (n <= 0) {
            a = new int[0]; // fuer denn fall das n <= 0 ist, wird die länge 0 für den Array a initialisiert
            System.out.println(Arrays.toString(a));
        }
        a = new int[n]; // wenn n positiv ist wird Array a mit der länge n initialisiert
        for (int i = 0; i < a.length; i++) {
            a[i] = i; // setzt die werte 0,1,2,3 ... bis a.length-1
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swab(int[] a, int p1, int p2) {
        if (p1 < 0 | p2 < 0 | p1 > a.length | p2 > a.length) {
            return;
        }
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
        System.out.println(Arrays.toString(a));
    }

    public static void shuffle(int[] a) {
        Random x = new Random();
        for (int i = 0; i < a.length ; i++) {
            int k = x.nextInt(a.length);
            int j = x.nextInt(a.length);
            int temp = a[k];
            a[k] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void shuffle1(int[] a) {
        Random x = new Random();
        for (int i = 0; i < a.length  - 1; i++) {
            int k = x.nextInt(a.length);
            int j = x.nextInt(a.length);
            int temp = a[k];
            a[k] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    public static int[] count(int[] a, int n) {
        int[] x = new int[n];

        for (int i = 0; i < a.length; i++) {
            x[a[i]] += 1;
        }
        return x;
    }

    public static void histogramm(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + ": ");
            for (int k = a[i]; k > 0; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}



