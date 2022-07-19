package Nr1;

public class stochastischeMatrix {

    public static boolean test(double[][]a){
        double sumseite;
        double sumoben;
        for(int i = 0; i < a.length;i++){
            sumseite = 0;
            sumoben = 0;
            for(int j = 0; j < a[i].length; j++){
                sumseite += a[i][j];
                //hier werden die werte in einer Reihe addiert
            }
            for (int k = 0; k < a.length; k++){
                sumoben += a[k][i];
                //hier werden die werde die untereinander sind addiert
                //Bsp. a[0][0] + a[1][0] + a[2][0] ...
                //oder a[0][2] + a[1][2] + a[1][3] ...
            }
            if (sumseite - 1 > 0.0001 || sumoben -1 > 0.0001){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double[][] a ={{0.6 , 0.3 , 0.2} , {0.2 , 0.4 , 0.4 } , {0.3 , 0.3 , 0.4}};
        System.out.println(test(a));
        //System.out.println(a[0][1]);
    }
}
