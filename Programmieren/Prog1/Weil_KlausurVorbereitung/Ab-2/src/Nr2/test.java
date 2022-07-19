package Nr2;

import Nr1.Punkt2D;

public class test {


    public static void main(String[] args) {
        Punkt2D a = new Punkt2D(22,11);
        Rechteck a1 = new Rechteck(a,7,3);

        System.out.println(a1.flaecheninhalt());
        System.out.println(a1.mittelpunkt());
        System.out.println(a1.quadrat());
        System.out.println(a1.umfang());
        System.out.println(a1.toString()); //gg

        double aa = 3;
        double b = 3.4;
        int d = 2;
        System.out.println(aa+ " " + b + " " + d);
    }
}
