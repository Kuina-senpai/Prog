package Ab10;

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
    public Rational add(Rational ref)throws ArithmeticException{
        Rational a = new Rational(((zaehler* ref.nenner)+(ref.zaehler*nenner)) , nenner*ref.nenner);
        if (a.nenner == 0){
            throw new ArithmeticException();
        }
        return a;
    }
    public Rational sub(Rational ref)throws ArithmeticException{
        Rational a = new Rational(((zaehler* ref.nenner)-(ref.zaehler*nenner)) , nenner*ref.nenner);
        if (a.nenner == 0){
            throw new ArithmeticException();
        }
        return a;

    }
    public Rational mul(Rational ref)throws ArithmeticException{
        Rational a = new Rational((zaehler*ref.zaehler) , (nenner*ref.nenner));
        if (a.nenner == 0){
            throw new ArithmeticException();
        }
        return a;
    }
    public Rational div(Rational ref)throws ArithmeticException{
        Rational a = new Rational((zaehler*ref.nenner) , (nenner*ref.zaehler));
        if (a.nenner == 0){
            throw new ArithmeticException();
        }
        return a;
    }
    public static Rational parse(String s)throws IllegalArgumentException,ArithmeticException{ //"GZ/GZ"
        int x = s.indexOf("/");
        if (s.equals(null)){
            throw new IllegalArgumentException();
        }
        if (x == -1){
            throw new IllegalArgumentException();
        }
        int a = Integer.parseInt(s.substring(0,x));
        int b = Integer.parseInt(s.substring(x+1 , s.length()));
        if (b == 0){
            throw new ArithmeticException();
        }
        return new Rational(a,b);

    }

    public String toString(){
        if (this.zaehler == 0 && this.nenner == 0){
            return "" +0;
        }
        if (this.zaehler > 1 && this.nenner == 1){
            return "" + zaehler;
        }
        return zaehler + "/" + nenner;
    }


    public static void main(String[] args) {
        Rational a = new Rational(-3, 7);
        Rational b = new Rational(28, 35);
        Rational c = new Rational(60, -135);

        System.out.println(parse("9/3"));
    }
}