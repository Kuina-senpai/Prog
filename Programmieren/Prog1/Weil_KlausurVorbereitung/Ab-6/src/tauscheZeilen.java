import java.util.Arrays;

public class tauscheZeilen {
    public static double[][] tausche(double[][] m ,int n, int k){
        /**for (int i = 0; i < m[n].length; i++){
            a = new double[m[n].length];
            a[i] = m[n][i];
        }
        for (int i = 0; i < m[k].length; i++){
            b = new double[m[k].length];
            b[i] = m[k][i];
        }**/

        if (n < m.length && k < m.length){
            double[] a = m[n];
            double[] b = m[k];
            m[k] = a;
            m[n] = b;
        }
        for (int i = 0; i < m.length; i++){
            for (int x = 0; x < m[i].length; x++){
                System.out.print(m[i][x] + " ");
            }
            System.out.println();
        }
        return m;
    }

    public static void main(String[] args) {
        double[][] a = {{1,1,1} , {2,2,2} , {3,3,3}};

        System.out.println(Arrays.toString(tausche(a,1,2)));
    }
}
