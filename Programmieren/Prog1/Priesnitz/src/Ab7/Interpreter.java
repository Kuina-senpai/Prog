package Ab7;

import java.io.PrintStream;
import java.util.Scanner;

public class Interpreter {

    public static void verarbeiteEingabe(java.io.PrintStream ps, Scanner sc){
        String position = sc.next();
        String zeichen = sc.next();
        String x = sc.next();
        String zeichenkette = sc.next();
        if (position.equals("vor")){
            verarbeiteEingabeEinzelVor(ps , sc , zeichen , zeichenkette);
        }
        if (position.equals("nach")){
            verarbeiteEingabeEinzelNach(ps ,  sc , zeichen , zeichenkette);
        }
    }
    public static void verarbeiteEingabeEinzelVor(java.io.PrintStream ps , Scanner sc , String zeichen, String zeichenkette){
        if (zeichenkette.contains(zeichen)){ // "zeichenkette" schaut ob "zeichen" in ihr enthalten ist
            String neu = zeichenkette.substring( 0 , zeichenkette.lastIndexOf(zeichen));
            ps.println(neu);
        }
    }
    public static void verarbeiteEingabeEinzelNach(java.io.PrintStream ps , Scanner sc , String zeichen, String zeichenkette){
        if (zeichenkette.contains(zeichen)) { // "zeichenkette" schaut ob "zeichen" in ihr enthalten ist
            String neu = zeichenkette.substring(zeichenkette.indexOf(zeichen) + 1 , zeichenkette.length());
            ps.println(neu);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream(System.out);
        verarbeiteEingabe(ps , sc);
    }
}
