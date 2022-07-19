package Ab3;

public class ggTMethoden {
    public static int ggTAdd(int a, int b){
        if (a == 0){
            return b;
        }
        if (b < 0){
            b = Math.abs(b);
        }
        while (b > 0){
            if (a > b){
                a -= b;
            }
            if (b >= a){
                b -= a;
            }
            System.out.println(a + " " + b);
        }
        return a;
    }
    public static int ggtAddRek(int a, int b){
        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }
        if (b < 0){
            b = Math.abs(b);
        }
        if (a > b && b > 0){
            return ggtAddRek(a-b , b);
        }
        else{
            return ggtAddRek(a, b-a);
        }
    }
    public static int ggTMul(int a, int b){
        if (b < 0){
            b = Math.abs(b);
        }
        while (true){
            int temp = a % b;
            a = b;
            b = temp;
            if (b == 0){
                return a;
            }
        }
    }
    public static int ggTMulRek(int a, int b){
        if (b == 0){
            return a;
        }
        else{
            return ggTMulRek(b, a % b); // führt das Verfahren aus, dass in ggTMul in der while stattfindet
        }
    }
    public static int ggTAddOut(int a, int b){
        int zähler = 0;
        if (a == 0){
            return b;
        }
        if (b < 0){
            b = Math.abs(b);
        }
        System.out.println(a + " " + b); // zeigt die ausgangswerte einmal
        while (b > 0){
            if (a > b){
                a -= b;
                System.out.println(a + " " + b); // wichtig : hier ausgabe der werte erst, nachdem sie verändert wurden
            }
            if (b >= a){
                b -= a;
                System.out.println(a + " " + b); // wichtig : hier ausgabe der werte erst, nachdem sie verändert wurden
            }
            zähler++;
        }
        return zähler;
    }
    public static int ggTMulOut(int a, int b){
        int zähler = 0;
        if (b < 0){
            b = Math.abs(b);
        }
        System.out.println(a + " " + b);
        while (b > 0){
            int temp = a % b;
            a = b;
            b = temp;
            if (b == 0){
                return a;
            }
            System.out.println(a + " " + b);
        }
        return zähler;
    }
    public static void main(String[] args) {
        System.out.println(Math.abs(ggTMul(60,-135)));
        System.out.println(ggTAdd(60, -135));
        //System.out.println(ggTMulOut(24,78));
    }
}
