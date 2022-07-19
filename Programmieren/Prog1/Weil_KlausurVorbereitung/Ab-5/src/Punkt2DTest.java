public class Punkt2DTest {
    public static void main(String[] args) {
        Punkt2D a = new Punkt2D(2,6);
        Punkt2D b = new Punkt2D(22 , 20);

        System.out.println(a.getX());
        System.out.println(b.getY());

        System.out.println(a.verschiebeUm(8,4));

        System.out.println(b.moveTo(20,10));
        System.out.println(b.getX());
        System.out.println(b.getY());

        System.out.println(a.toString());
        System.out.println(b.toString());


        System.out.println(Punkt2D.abstand(a,b));
    }
}
