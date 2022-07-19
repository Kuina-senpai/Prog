package Ab9;

import com.sun.source.tree.BreakTree;

public class Mathe {
    public static int addLoop(int a, int b) { //a+b
        int result = Math.min(a, b);
        int i = 0;
        if (a < 0 && b < 0) {
            return subLoop(a, b * (-1));
        }
        while (i < Math.max(a, b)) {
            i++;
            result++;
        }
        return result;
    }

    public static int subLoop(int a, int b) { //a-b
        int result = a;
        int i = 0;
        if (b < 0) {
            return addLoop(a, b * (-1));
        }
        while (i < b) {
            result--;
            i++;
        }
        return result;
    }

    public static int mulLoop(int a, int b) { //a*b
        if (a < 0 && b < 0) {
            a *= (-1);
            b *= (-1);
        }
        int result = Math.min(a, b);
        int i = 1;
        while (i < Math.max(a, b)) {
            result = addLoop(result, Math.min(a, b)); // sorgt für 5+5=10 10+5=15 15+5=20 ... da result das ergebnis der addition jedes mal zwischen speichert
            i++;
        }
        return result;
    }

    public static int divLoop(int a, int b) { // a/b
        /**int aa = a;
         int bb = b;
         if (a<0 && b<0){
         a *= (-1);
         b *= (-1);
         }
         if (a < 0){
         a *= (-1);
         }
         if (b < 0){
         b *= (-1);
         }
         int result = Math.min(a,b);
         int i = 1;
         while (result < Math.max(a,b)) {
         result = addLoop(result, Math.min(a, b));
         System.out.println(i);
         ++i;
         }
         if ((aa<0 && bb<0) || (aa>0 && bb>0)){
         return i;
         }
         return i * (-1);**/
        int result = 1;
        if (a<0 && b<0){
            a = Math.abs(a);
            b = Math.abs(b);
        }
        while (true) {
            int x = mulLoop(result, b);
            if (a < 0 && b < 0) {
                result++;
            }
            if (a > 0 && b > 0){
                result++;
            }
            if (a < 0 || b < 0) {
                result--;
            }
            if (x == a) {
                if (x > 0){
                    return --result;
                }
                else{
                    return ++result;
                }
            }
        }
    }

    public static int modLoop(int a, int b) {
        int result = a;
        int i = 0;
        while (result >= b) {
            result = subLoop(result, b);
            i++;
        }
        return result;
    }

    public static int powLoop(int a, int b) {
        int result = a;
        int i = 1;
        if (a == 0 && b == 0) {
            return 1;
        }
        while (i < b) {
            result = mulLoop(result, a);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(-20/-4);
         System.out.println(divLoop(-40,-4));

    }
}