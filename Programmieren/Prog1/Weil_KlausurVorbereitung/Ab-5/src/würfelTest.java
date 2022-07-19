import java.util.Random;

public class würfelTest {
    public static void main(String[] args) {
        Random r = new Random ();

        würfel a = new würfel();
        würfel b = new würfel();

        System.out.println(würfel.pasch(a,b));

        System.out.println(a.getAugenZahl());
        System.out.println(a.wuerfeln());
        System.out.println(a.getAugenZahl());

        System.out.println(b.getAugenZahl());
        System.out.println(b.wuerfeln());
        System.out.println(b.getAugenZahl());
    }
}
