package Ab6;

public class Zeichenkette {

    public static int anzahlBuchstaben(String s){ //gg
        int i = 0;
        int pos = 0;
        while (pos < s.length()){ //kleiner als String länge. Wird gezählt wie arrays
            char a = s.charAt(pos);
            if (Character.isLetter(a)){
                i++;
            }
            pos++;
        }
        return i;
    }
    public static boolean istZiffernfolge(String s){ //gg
        if (s.length() == 0){
            return true;
        }
        int pos = 0;
        while (pos < s.length()){ //kleiner als String länge. Wird gezählt wie arrays
            char a = s.charAt(pos);
            if (Character.isWhitespace(a) || Character.isLetter(a)){
                return false;
            }
            pos++;
        }
        return true;
    }
    public static boolean istName(String s){ //gg
        if (s.length() == 0){
            return true;
        }
        int pos = 0;
        while (pos < s.length()){ //kleiner als String länge. Wird gezählt wie arrays
            char a = s.charAt(pos);
            if (s.charAt(0) == '-' || s.charAt(s.length() - 1) == '-'){
                return false;
            }
            if (Character.isWhitespace(a) || Character.isDigit(a)){
                return false;
            }
            pos++;
        }
        return true;
    }
    public static String vokaleGross(String s){ //Gg
        String neu = "";
        int pos = 0;
        while (pos < s.length()){ // hier wird ein neuer String zsm gebaut nur aus klein buchstaben
            char a = s.charAt(pos);
            neu += Character.toLowerCase(a);
            pos++;
        }
        pos = 0;
        s = "";
        while (pos < neu.length()){ //hier wird "neu" wieder zu "s" nur das Vokale Gross sind
            char b = neu.charAt(pos);
            if (b == 'a' || b == 'e' || b == 'i' ||  b == 'o' || b == 'u'){
                s += Character.toUpperCase(b);
            }else{
                s += b;
            }
            pos++;
        }
        return s;
    }
    public static String rueckwaerts(String s){
        String neu = "";
        int pos = s.length() - 1;
        while (pos >= 0){
            char a = s.charAt(pos);
            neu += a;
            pos--;
        }
        return neu;
    }
    public static String einfuegung(String s, int p, String t){
        String neu = "";
        int pos = 0;
        while (pos < p){ // erster TeilString von s bis p wird in "neu" erzeugt
            char a = s.charAt(pos);
            neu += a;
            pos++;
        }
        neu += t; // t wird in "neu" eingefügt
        pos = s.length();
        while (p < pos){ // rest von s wird an "neu" hinzugefügt
            char a = s.charAt(p);
            neu += a;
            p++;
        }
        return neu;
    }
    public static String verkuerze(String s , int n){
        String x = "[...]";
        String neu = "";
        int pos = 0;
        while (pos < n){
            neu += s.charAt(pos);
            pos++;
        }
        neu += x;
        pos = 1;
        while (pos <= n){ //rest String von s wird von hinten an "neu" hinzugefügt
            neu += s.charAt(s.length() - pos);
            pos++;
        }
        if (neu.length() < s.length()){
            return neu;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println(verkuerze("Abrakadabra" , 3));

    }

}
