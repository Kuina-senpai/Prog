import java.util.Scanner;

public class scanner {
    public static int eingabe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine zahl ein");
        int a = sc.nextInt();
        if (a < 0){
            return 0;
        }

        System.out.println("geben sie eine Zahl ein");
        int i = a;
        while(sc.hasNext()){
            System.out.println("geben sie eine Zahl ein");
            a = sc.nextInt();
            if (a <= 0) {
                return i;
            }
            if (a < i) {
                i = a;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(eingabe());
    }
}
