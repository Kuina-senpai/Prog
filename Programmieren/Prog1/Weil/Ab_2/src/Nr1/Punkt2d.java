package Nr1;

public class Punkt2d {
    public double x;
    public double y;

    public Punkt2d (){
        this.x = 0;
        this.y = 0;
    }
    public Punkt2d (double a, double b){
        this.x = a;
        this.y = b;
    }
    public Punkt2d (Punkt2d k){
        x = k.x;
        y = k.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Punkt2d verschiebeUm (double dx, double dy){
        x += dx;
        y += dy;
        return this;
    }
    public Punkt2d moveTo (double kx, double ky){
        x = kx;
        y = ky;
        return this;
    }

   /* @Override
    public String toString() {
        return "Punkt2d{" +                toString methode von der IDE
                "x=" + x +
                ", y=" + y +
                '}';
    }*/

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    public static void main(String[] args) {
        Punkt2d first = new Punkt2d(3.5,4.5);
        System.out.println(first);


        Punkt2d t1 = new Punkt2d();
        Punkt2d t2 = new Punkt2d(9.5, 5);
        Punkt2d t3 = new Punkt2d(8.4, 4.2);
        System.out.println(t1);

    }
}
