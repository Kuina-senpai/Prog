package Nr2;

public class IntArrayUtil2 {


//Überarbeitete Methoden AB9

    public static int max(int[]array) throws Exception {
        int i = 0;
        if (array.length == 0){
            throw new ArrayLeerException();
        }
        for (int a = 0; a < array.length; a++){
            if (array[a] > i){
                i = array[a];
            }
        }
        return i;
    }

    public static int[] count(int[] a, int n) throws Exception {
        if (n < 0){ // zuerst auf fehler prüfen
            throw new ArrayException("negativer Wert als Arraylaenge");
        }

        int[] x = new int[n];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0  || a[i] > n){
                throw new IllegalArgumentException("unzulaessiger Arrayeintrag");
            }
            x[a[i]] += 1;
        }
        return x;
    }

    public static void histogramm(int[]a) throws Exception {

        count(a,max(a) + 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(i + ": ");
            for (int k = a[i]; k > 0; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}




