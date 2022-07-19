package Nr2;

public class Hobbit extends Wesen{

    private int lebenserwartung = 150;

    public Hobbit(String name, int age){
        super(name,age);
    }

    public int getLebenserwartung(){
        return lebenserwartung;
    }
    public void setLebenserwartung(int a){
        if (a > 150){
            System.out.println("Die eingebene lebenserwartung ist maximal 150");
            return;
        }else {
            this.lebenserwartung = a;
        }
    }

    @Override
    public boolean lebendig() {
        if (super.getAlter() < lebenserwartung){
            return true;
        }
        return false;
    }

    @Override
    public void gruss() {
        System.out.println("Hallo!");
    }

    public void wirdVerwundet(int erhalternerSchaden){
        if (erhalternerSchaden < lebenserwartung){
            this.lebenserwartung -= erhalternerSchaden;
            System.out.println("aktuelle lebenswertung " + this.lebenserwartung);
        }
        if (erhalternerSchaden >= lebenserwartung){
            this.lebenserwartung = 0;
            System.out.println(super.getName() + " hat tödlichen schaden erlitten und ist gestorben");
        }
    }

    public String toString(){
        if (lebenserwartung > 0){
            return super.toString() + " " + lebenserwartung;
        }
        return super.toString() + " bereits gestorben" ;
    }
}
