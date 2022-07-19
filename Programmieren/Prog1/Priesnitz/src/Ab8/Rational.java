package Ab8;

import Ab3.ggTMethoden;

public class Rational {
    private int zaehler;
    private int nenner;

    public Rational(){
        this.zaehler = 0;
        this.nenner = 0;
    }
    public Rational(int zaehler){
        this.zaehler = zaehler;
        this.nenner = 1;
    }
    public Rational(int zaehler, int nenner){
        this.zaehler = zaehler/ggTMethoden.ggTMul(zaehler,nenner);
        this.nenner = nenner/ggTMethoden.ggTMul(zaehler,nenner);
    }

    public Rational(Rational ref){
        this.zaehler = ref.zaehler;
        this.nenner = ref.nenner;
    }
    public int getNenner() {
        return nenner;
    }
    public int getZaehler() {
        return zaehler;
    }
    public boolean equals(Rational ref){
        if (this.zaehler == ref.zaehler && this.nenner == ref.nenner){
            return true;
        }
        return false;
    }
    public boolean istKleiner(Rational ref){
        this.zaehler *= ref.nenner;
        ref.zaehler *= this.nenner;
        if (this.zaehler > ref.zaehler){
            return true;
        }
        return false;
    }
    public Rational abs(){
        Rational a = new Rational(Math.abs(this.zaehler) , Math.abs(this.nenner));
        return a;
    }
    public Rational rez(){
        if (this.zaehler > 0){
            return new Rational(this.nenner , this.zaehler);
        }
        return new Rational(this.nenner * (-1) , this.zaehler * (-1));
    }
    public Rational add(Rational ref){
        return new Rational(((zaehler* ref.nenner)+(ref.zaehler*nenner)) , nenner*ref.nenner);
    }
    public Rational sub(Rational ref){
        return new Rational(((zaehler* ref.nenner)-(ref.zaehler*nenner)) , nenner*ref.nenner);
    }
    public Rational mul(Rational ref){
        return new Rational((zaehler*ref.zaehler) , (nenner*ref.nenner));
    }
    public Rational div(Rational ref){
        return new Rational((zaehler*ref.nenner) , (nenner*ref.zaehler));
    }
    public String toString(){
        if (this.zaehler == 0 && this.nenner == 0){
            return "" +0;
        }
        return zaehler + "/" + nenner;
    }

    public static void main(String[] args) {
        Rational a = new Rational(-3 , 7);
        Rational b = new Rational(28,35);
        Rational c = new Rational(60,-135);

        //System.out.println(a.toString());
        //System.out.println(a.rez());
        //System.out.println(b.toString());
        //System.out.println(c.toString());
        int i = 1;
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(++i);
    }
}