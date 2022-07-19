package Ab3;

import Ab3.Punkt2D;

public class RechteckXYPerEcke {
    private Punkt2D lu;
    private Punkt2D ro;

    public RechteckXYPerEcke(double xl, double xr, double yo, double yu){
        lu = new Punkt2D(xl,yu);
        ro = new Punkt2D(xr,yo);
        /**this.lu.setX(xl);
        this.lu.setY(yu);
        this.ro.setX(xr);
        this.ro.setY(yo);**/
    }
    public RechteckXYPerEcke(Punkt2D a, Punkt2D b){
        lu = new Punkt2D(a);
        ro = new Punkt2D(b);
        /**this.lu.setX(a.getX()); funktioniert nicht. Man kann nichts "set`en" was "Null" ist
        this.lu.setY(a.getY());
        this.ro.setX(b.getX());
        this.ro.setY(b.getY());**/
    }
    public RechteckXYPerEcke(RechteckXYPerEcke ref){
        lu = new Punkt2D(ref.lu);
        ro = new Punkt2D(ref.ro);
        /**this.lu.setX(ref.lu.getX());
        this.lu.setY(ref.lu.getY());
        this.ro.setX(ref.ro.getX());
        this.ro.setY(ref.ro.getY());**/
    }
    public boolean equals(RechteckXYPerEcke ref){
        if (this.lu.getX() == ref.lu.getX() &&
            this.lu.getY() == ref.lu.getY() &&
            this.ro.getX() == ref.ro.getX() &&
            this.ro.getY() == ref.ro.getY() ) {
            return true;
        }
        return false;
    }
    public double breite(){
        return ro.getX() - lu.getX();
    }
    public double hoehe(){
        return ro.getY() - lu.getY();
    }
    public Punkt2D ecke(boolean istRechts, boolean istOben){
        if (istRechts && istOben){
            return new Punkt2D( ro );
        }
        if (!istRechts && istOben){
            return new Punkt2D(ro.getY() , lu.getX());
        }
        if (istRechts && !istOben){
            return new Punkt2D(ro.getX() , lu.getY());
        }
        return new Punkt2D(lu);
    }
    public Punkt2D ecke(int n) throws Exception{
        if (n > 3){
            throw new Exception("Eingabe ausserhalb des intervalls");
        }
        if (n == 3){
            return new Punkt2D(ro.getY() , lu.getX());
        }
        if (n == 2){
            return new Punkt2D(ro);
        }
        if (n == 1){
             return new Punkt2D(ro.getX() , lu.getY());
        }
        return lu;
    }
    public Punkt2D mitte(){
        double abstand_Y_achse = lu.getX();
        double abstand_x_achse = lu.getY();
        double rechtEckBreite = breite() / 2;
        double rechtEckHoehe = hoehe() / 2;
        return new Punkt2D(abstand_Y_achse + rechtEckBreite , abstand_x_achse + rechtEckHoehe);
    }
    public double durchmesser(){
        return Math.sqrt( (Math.pow(breite(),2)) + (Math.pow(hoehe() , 2)) );
    }
    public double umfang(){
        return ((breite() + breite()) + (hoehe() + hoehe()));
    }
    public double flaeche(){
        return breite()*hoehe();
    }
    public RechteckXYPerEcke verschiebe(double x , double y){
        double lux = lu.getX() + (x);
        double luy = lu.getY() + (y);
        double rox = ro.getX() + (x);
        double roy = ro.getY() + (y);
        Punkt2D lu = new Punkt2D(lux,luy);
        Punkt2D ro = new Punkt2D(rox,roy);
        RechteckXYPerEcke neu = new RechteckXYPerEcke(lu,ro);
        return neu;
    }
    public String toString(){
        return "[" + lu.toString() + "," + ro.toString() + "]";
    }

    public static void main(String[] args) {
        Punkt2D a = new Punkt2D(2,1);
        Punkt2D b = new Punkt2D(8,4);
        RechteckXYPerEcke x = new RechteckXYPerEcke(a,b);
        System.out.println(x.breite() + " " + x.breite()/2 + " " + ((x.breite()/2) + a.getX()));
        System.out.println(x.breite());
        System.out.println(x.hoehe());
        System.out.println(x.mitte());
        System.out.println(x.umfang());
        System.out.println(x.flaeche());
        System.out.println(x.durchmesser());
        System.out.println(x.toString());
    }
}
