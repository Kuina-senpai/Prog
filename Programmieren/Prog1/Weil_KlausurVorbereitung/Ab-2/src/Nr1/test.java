package Nr1;

public class test {
    public static void main(String[] args) {
        Punkt2D a = new Punkt2D();
        Punkt2D b = new Punkt2D(12,5.5);

        Punkt2D c = new Punkt2D(24, 23.7);
        Punkt2D d = new Punkt2D(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(d); //gg

        System.out.println(a.verschiebeUm(-2.0,5.3));
        System.out.println(b.moveTo(3.8,-12.4));
        System.out.println(c.verschiebeUm(-1.0,1)); //gg
    }


}
