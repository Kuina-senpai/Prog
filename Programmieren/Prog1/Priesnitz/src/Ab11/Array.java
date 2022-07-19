package Ab11;

public class Array {
    public static boolean istHomogen(int[] f) {
        if (f.length == 0) {
            return true;
        }
        int i = 0;
        while (i < f.length) {
            int a = f[0];
            if (a != f[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean istSortiert(int[] f) {
        if (f.length == 0) {
            return true;
        }
        int i = 0;
        while (i < f.length - 1) {
            if (f[i] > f[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int maxPos(int[] f) throws Exception{
        if (f.length == 0){
            throw new NullPointerException();
        }
        int max = f[0];
        int pos = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] > max){
                max = f[i];
                pos = i;
            }
        }
        return pos;
    }
    public static int maxElement(int[] f){
        int max = f[0];
        for (int i = 0; i < f.length; i++){
            if (f[i] > max){
                max = f[i];
            }
        }
        return max;
    }
    public static int[] max (int[] a , int[] b)throws IllegalArgumentException,NullPointerException{
        if (a.length != b.length){
            throw new IllegalArgumentException();
        }
        if (a.length == 0 || b.length == 0){
            throw new NullPointerException();
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++){
            if (a[i] > b[i]){
                c[i] = a[i];
            }
            if (b[i] >= a[i]){
                c[i] = b[i];
            }
        }
        return c;
    }


    public static void main(String[] args) {
        int[] f = {1, 4, 7, 7, 5, 7, 5, 1};
        int[] g = {1, 2, 4, 5, 4, 3, 2, 1};
        System.out.println(max(f,g));
    }
}