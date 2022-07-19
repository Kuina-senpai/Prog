package Nr2;

import java.util.Arrays;

public class x {


    public static int[][] tauscheZeilen(int[][] m, int n, int k) {
        // Zeile n wird mit Zeile k getauscht
        int[] temp = new int[m[n].length];

        for (int i = 0; i < m[n].length; i++) {
            temp[i] = m[n][i]; //Werte aus Zeile n werden temporär Übergeben
        }
        for (int j = 0; j < m[k].length; j++) {
            m[n][j] = m[k][j]; // Zeile n bekommt die Werte aus Zeile k
        }
        for (int x = 0; x < m[k].length; x++) {
            m[k][x] = temp[x]; // Zeile k bekommt die Werte aus temp = n
        }

        for (int a = 0; a < m.length; a++) {
            for (int b = 0; b < m[a].length; b++) {
                System.out.print(m[a][b] + " ");
            }
            System.out.println();
        }
        return m;
    }

    public static void main(String[] args) {
        int[][] a = {{6, 3, 2}, {2, 4, 4}, {3, 3, 4}};
        System.out.println(tauscheZeilen(a, 0, 1));
    }
}
