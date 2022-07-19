package Nr22;

public class Magier extends Wesen implements gruss,Tragbar {

    public Magier(String name, int alter){
        super(name,alter);
    }
    public Magier(String name, int alter, double geldbeutel){
        super(name,alter,geldbeutel);
    }
    public boolean lebendig() {
        return true; // denn magier sind unsterblich und somit immer lebendig
    }
    public String gruss(){
        return "Sei gegruesst!";
    }
    public void heilt(Hobbit ref){
        if (ref.lebendig()){
            ref.setLebenserwartung(150);
            System.out.println(ref.getName() + " wurde vollständig geheilt");
        }else{
            System.out.println(ref.getName() + " ist bereits gestorben und kann nicht mehr geheilt werden");
        }
    }

    public double gewicht(){
        return 0;
    }
    public boolean nehmen(Tragbar a){
        setDing(a); //magier können alles tragen
        return true;
    }
    public String toString(){
        return super.toString();
    }
}
