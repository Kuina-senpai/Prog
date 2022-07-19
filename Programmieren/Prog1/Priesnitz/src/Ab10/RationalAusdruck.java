package Ab10;
import static Ab10.Rational.parse;
import java.util.Scanner;

public class RationalAusdruck {
    public static Rational auswertung(Rational a , String s , Rational b)throws IllegalArgumentException,ArithmeticException{
        if (a == null || b == null){
            throw new IllegalArgumentException();
        }
        if (a.getNenner() == 0 || b.getNenner() == 0){
            throw new ArithmeticException();
        }
        switch (s){
            case "+" : return a.add(b);
            case "-" : return a.sub(b);
            case ":" :
            case "/" :
                return a.div(b);
            case "*" : return a.mul(b);
            default: throw new IllegalArgumentException();
        }
    }

    public static Rational next(Scanner sc){
        String a = sc.next(); //sc.next() hört bei white spaces auf zu lesen
        String zeichen = sc.next();
        String b = sc.next();
        return auswertung(parse(a),zeichen,parse(b));
    }
    public static Rational parse(String s)throws IllegalArgumentException,ArithmeticException{ //"GZ/GZ"
        int x = s.indexOf("/");
        if (s.equals(null)){
            throw new IllegalArgumentException();
        }
        if (x == -1){
            throw new IllegalArgumentException();
        }
        int a = Integer.parseInt(s.substring(0,x));
        int b = Integer.parseInt(s.substring(x+1 , s.length()));
        if (b == 0){
            throw new ArithmeticException();
        }
        return new Rational(a,b);
    }
    public static void dialog(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            System.out.println( "= " + next(sc));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dialog();
    }
}
