package Ab3;

public class Datum {
    public static boolean istSchaltjahr(int n){
        if (n < 1583 && n % 4 == 0){
            return true;
        }
        if (n >= 1583 && ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(istSchaltjahr(1605));
    }
}
