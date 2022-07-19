public class stochastischerArray {
    public boolean matrix(int[][] a){
        double e = 0.0000000001; //bei kommazahlen sollte man darauf achten einen vergleichswert zu verwenden
        double side;
        double down;
        for (int i = 0; i < a.length; i++){
            side = 0;
            down = 0;
            for (int k = 0; k < a[i].length; k++){
                side = a[i][k];
                down = a[k][i];
            }
            if (side - 1 < e || down -1 < e){
                return false;
            }
        }
        return true;
    }
}
