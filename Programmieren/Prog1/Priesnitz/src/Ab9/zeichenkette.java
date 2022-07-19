package Ab9;

public class zeichenkette {
    public static boolean istPalindrom(String s){
        int i = 0;
        String b = "";
        String sneu = "";
        while (i < s.length()){
            if (Character.isLetterOrDigit(s.charAt(i))){
                sneu += s.charAt(i);
            }
            i++;
        }
        i = 1;
        while (i <= sneu.length()){
            b += sneu.charAt(sneu.length() - i);
            i++;
        }
        i = 0;
        while (i < sneu.length()){
            if (b.charAt(i) != sneu.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(istPalindrom("12 321"));
        String s = "hallo";
        //System.out.println(s.charAt(s.length() -1));
    }
}
