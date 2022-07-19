package Nr2;

import Nr1.Punkt2D;

public class Rechteck {
    private Punkt2D referenzpunkt = new Punkt2D(); // Der Referenzpunkt ist ein Punkt und besteht somit aus 2 koordinaten, deshalb wird hier Punkt2D verwendet
    private double laenge;
    private double breite;

    public Rechteck(){}
    public Rechteck(Punkt2D a, double l, double b){
        this.referenzpunkt = a;
        this.laenge = l;
        this.breite = b;
    }
    public Punkt2D verschiebe(double x, double y){
        return referenzpunkt.verschiebeUm(x,y);
    }
    public double flaecheninhalt(){
        return laenge * breite;
    }
    public double umfang(){
        return (2 * laenge) + (2 * breite);
    }
    public Punkt2D mittelpunkt(){
        //erklärung in goodnotes
        double xKoordinate = (laenge / 2) + referenzpunkt.getX();
        double yKoordinate = (breite / 2) + referenzpunkt.getY();
        return new Punkt2D(xKoordinate,yKoordinate);
    }
    public boolean quadrat() {
        return laenge == breite;
    }
    public String toString(){
        return "Referenzpunkt x koordinate: " + referenzpunkt.getX() + "\n"
                + "Referenzpunkt y koordinate: " + referenzpunkt.getY() + "\n"
                + "unten: " + laenge + "\n"
                + "oben: " + breite;
    }

}
