package Nr22;

public class test {
    public static void main(String[] args) {
        Wesen x = new Hobbit("Lukas" , 19, 200);
        Wesen a = new Hobbit("elias" , 21);
        Wesen b = new Magier("hasib" , 21);
        Hobbit c = new Hobbit("Huy" , 20);
        Magier d = new Magier("ben" , 20);

        Gegenstand e = new Gegenstand("Hammer" , 10);
        Gegenstand f = new Gegenstand("Dolch" , 20);
        Gegenstand g = new Gegenstand("Schild" , 30);
        Gegenstand h = new Gegenstand("katana" , 50);


        Tragbar schwert = new Waffe("schwert" , 10);

        /**System.out.println(x.nehmen(schwert));
        System.out.println(x.tragen());
        System.out.println(a.nehmen(schwert));**/

        System.out.println(x.kaufen(e));
        System.out.println(x.kaufen(f));
        System.out.println(x.kaufen(g));
        System.out.println(x.kaufen(h));

        System.out.println(x.getGeldBeutel());



    }
}
