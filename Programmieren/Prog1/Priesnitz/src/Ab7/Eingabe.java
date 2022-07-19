package Ab7;

import java.io.PrintStream;
import java.util.Scanner;

public class Eingabe {
    public static int filter(Scanner scan , PrintStream ps , String start , String stop , String skip ){
        String textin="", res="";
        int i = 0;
        while (scan.hasNext()){
            textin=scan.next();

            if(textin.equals(start)){
                while(scan.hasNext() && !textin.equals(stop)){
                    textin=scan.next();
                }
            }

            else if(textin.equals(skip))
                scan.nextLine();

            else{
                res+=textin+" ";
                i++;
            }
        }
        ps.append(res);
        ps.println();
        ps.flush();
        return i;
    }

    public static void echo (Scanner sc){
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        echo(sc);
    }
}
