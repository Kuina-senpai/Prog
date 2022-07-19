package Nr3;

import static Nr3.IntArrayUtil.*;


public class test {
    public static void main(String[] args) {
        int[] a = {0, 1 , 1 , 3 ,2, 3, 4, 5, 6, 7, 8};
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
       // System.out.println(IntArrayUtil.toString(a));
        //System.out.println(areEqual(a,b));
        //createSequence(22);
        //swab(b,1,2);
        shuffle1(b);
        shuffle(b);
        //System.out.println(Arrays.toString(count(a,9)));
        //histogramm(count(a,9));
    }
}
