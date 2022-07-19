package Nr2;

import Nr1.Punkt2d;

public class rechteck {
    public Punkt2d p;
    public double länge;
    public double breite;

    public rechteck(){
        this.p = new Punkt2d(0,0);
        this.länge = 0;
        this.breite = 0;
    }
    public rechteck (Punkt2d p, double b, double c){
        this.p = p;
        länge = b;
        breite = c;
    }
    public rechteck verschiebeUm (double a, double b){
        //Falsch hier muss das Punkt2D Objekt mittels VerschiebeUm verschoben werden
        // dieses verschieben betrifft nicht länge oder breite
        länge = a;
        breite = b;
        return this;
    }
    public double fläche(){
        return länge * breite;
    }
    public double umpfang(){
        return (länge + breite) * 2;
    }
    public Punkt2d mittelpunkt(){
        double x = länge/2;
        double y = breite/2;
        return new Punkt2d(x,y);
    }
    public boolean istQuadrat(){
        if (breite == länge){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "rechteck{" +
                "referenzpunkt=" + p +
                ", länge=" + länge +
                ", breite=" + breite +
                '}';
    }

    public static void main(String[] args) {
        //rechteck a = new rechteck(0,8,8);
        //System.out.println(a.mittelpunkt());
    }
}
