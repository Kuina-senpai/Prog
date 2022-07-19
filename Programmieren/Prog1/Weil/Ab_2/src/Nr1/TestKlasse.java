package Nr1;

public class TestKlasse {
    public static void main(String[] args) {
        Punkt2d first = new Punkt2d(3.5,4.5);
        //System.out.println(first);

        Punkt2d t1 = new Punkt2d();
        Punkt2d t2 = new Punkt2d(9.5, 5);
        Punkt2d t3 = new Punkt2d(8.4, 4.2);
        //System.out.println(t1);
        //System.out.println(t2);
        //System.out.println(t3);

        //Aufgabenbereich c
        Punkt2d p1 = new Punkt2d(8, 10);
        System.out.println(p1.verschiebeUm(-2.0, 5.3));
        Punkt2d p2 = new Punkt2d(8, 10);
        System.out.println(p2.moveTo(3.8 , -12.4));
        Punkt2d p3 = new Punkt2d(8, 10);
        System.out.println(p3.verschiebeUm(-1.0 , 1));
    }
}
