package Nr1;
import java.util.Scanner;


public class scanner {

    public static int eingabe(){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        if (min < 1){

            return 0;
        }
        System.out.println("Gib erneut eine zahl ein");
        while (sc.hasNext()){
            int a = sc.nextInt();
            if (a < 1){
                sc.close();
                return min;
            }
            if (a < min){
                min = a;
            }
            System.out.println("Gib erneut eine zahl ein");
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(eingabe());
    }
}

