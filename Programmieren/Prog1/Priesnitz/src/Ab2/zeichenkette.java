package Ab2;


public class zeichenkette {
    public void grussMitZeit(int n , String name){
        if (n < 12){
            System.out.println("Guten Morgen " + name + "!");
        }
        if (n >= 18){
            System.out.println("Guten Abend " + name + "!");
        }else{
            System.out.println("Guten Tag " + name + "!");
        }
    }
    public static String zitronenEis(int n){
        String a1 = "super";
        String a2 = "Leckeres";
        String b1 = "Z";
        String b2 = "Zitroneneis";
        String a3 = "";
        String b3 = "";
        while (n > 0){
            a3 += a1;
            b3 += b1;
            n--;
        }
        return a3 + a2 + " " + b3 + b2;
    }
    public static String wiederhole(int n , String s , char x){
        String result = "";
        while (n > 1){
            result += s + x;
            n--;
        }
        return result + s;
    }
    public static void main(String[] args) {
        System.out.println(wiederhole(3,"Humba", ','));
    }
}
