package Ab3;

public class Mathe {
    public static void ausgabeVielfaches(int a, int n){
        int i = 1;
        while (i <= n){
            System.out.print(a*i + " ");
            i++;
        }
    }
    public static void ausgabe1x1(int n){
        /**
         * interessant, denn wenn der multiplikator = 1 und z++ = 1 2 3 4 ...
         * und dann geht der multiplikator + 1 und z beginnt wieder von vorne = 2 4 6 8 ...
         * Ergebnis 1 2 3 4 5
         *          2 4 6 8 10
         *          3 6 9 12 15 (15 = multiplikator(3) mal z=5 )
         */
        int startwert = 1;
        int multiplikator = 1;
        int z = 1;
        while (startwert <= n){
            while (z <= n){
                System.out.print(z * multiplikator + " ");
                z++;
            }
            z = 1;
            System.out.println();
            startwert++;
            multiplikator++;
        }
    }
    public static void ausgabe1x1Neu(int n){
        for (int a = 1; a <= n; a++){
            for (int b = 1; b <= n; b++){
                System.out.print(a*b + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ausgabe1x1(5);
    }
}
