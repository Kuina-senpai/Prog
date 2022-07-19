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
                return true;
            }
        }
        return false;
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
    public static int[] count(int[] a, int n){ // a hat nur werte aus dem Bereich 0 (einschließlich) bis n (ausschließlich)
        int[] k = new int[n];
        for (int i = 0; i < a.length; i++){
            k[a[i]] += 1;//wenn a[i] den wert 2 hat geht man in k an die zweite position
        }
        return k;
    }
    public static void histogramm(int[] k , int n){
        int[]x = count(k , n);
        for (int a = 0; a < x.length; a++){
            System.out.print(a + ": ");
            for (int b = 0; b < x[a]; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,2,3,4,5,6,7,8,9};
        histogramm(a,10); // n muss 1 größer sein als der grösste wert im array selbst
    }
}
