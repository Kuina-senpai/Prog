package Nr2;

import java.util.Random;

public class IntArrayUtil {
    public static String toString(int[] a){
        String s = " ";
        for (int i = 0; i < a.length; i++){
            s += a[i];
        }
        return s;
    }
    public static boolean areEqual(int[] a, int[] b){
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++){
                if (a[i] != b[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[] createSequence(int n){//erzeugt ein neues array
        int[] a = new int[0];
        if (n > 0){
            for (int i = 0; i < n; i++){
                a = new int[n-1];
                a[i] = i;
            }
        }
        return a;
    }
    public static void swap(int[] k, int a, int b){
        if ((a < 0 || a > k.length) || (b < 0 || b > k.length)){
            return;
        }
        int temp = k[a];
        k[a] = k[b];
        k[b] = temp;
    }
    public static void shuffle(int[] a){
        Random r = new Random();
        int[] vergleich = new int[a.length];
        for (int i = 0; i < a.length; i++){
            int r1 = r.nextInt(0, a.length);
            if (vergleich[r1] == 0 && i != r1){ //damit er die position nicht mit sich selber tauscht
                swap(a,i,r1);
                vergleich[r1] = 1;
            }
        }
    }
    //erzeugt neuen array
    public static int[] count(int[] a, int n)throws ArrayException{ // a hat nur werte aus dem Bereich 0 (einschließlich) bis n (ausschließlich)
        if (n < 0){
            throw new ArrayException("negativer Wert als Arraylaenge");
        }
        int[] k = new int[n];
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0 || a[i] >= n){
                throw new WertException();
            }
            k[a[i]] += 1;//wenn a[i] den wert 2 hat geht man in k an die zweite position
        }
        return k;
    }

    public static void histogramm(int[] k)throws Exception{//perfekter fall für mehrfaches try catch
        int[]x = count(k , max(k) + 1); //fehler die beim Aufrufen von count entstehen können müssen hier nicht nochmal definierrt werden
        for (int a = 0; a < x.length; a++){
            if (x[a] < 0){
                throw new WertException();
            }
            System.out.print(a + ": ");
            for (int b = 0; b < x[a]; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int max(int[] a)throws ArrayLeerException{
        if (a.length == 0){
            throw new ArrayLeerException();
        }
        int i = a[0];
        for (int k = 1; k < a.length; k++){
            if (a[k] >= i){
                i = a[k];
            }
        }
        return i;
    }

    public static void main(String[] args) throws Exception {
        /**int[] a = {1,1,1,1,1,2,3,4,3,6,7,8,9};
        histogramm(a,10); // n muss 1 größer sein als der grösste wert im array selbst
        int[] b = {-200,-2,-10,-65,-6,-7};
        System.out.println(IntArrayUtil.max(b));**/


        int[] c = IntArrayUtil.createSequence(0);
        int[] d = {-1, 10, 12};
        int[] e = {6, 8, 1, 8, 5, 2, 2, 3, 7, 1, 5, 3, 1, 0, 1, 5, 6, 6, 9 };

        //histogramm(c);
        //histogramm(d);
        //histogramm(e); //gg

        try {
            histogramm(c);
        }
        catch (ArrayException k){
            k.getMessage();
        }

    }
}
