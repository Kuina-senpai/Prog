package Nr2;

public class Magier extends Wesen{

    public Magier(String name, int age){
        super(name,age);
    }

    @Override
    public boolean lebendig() {
        return true; // Magier sind unsterblich
    }

    public void gruss(){
        System.out.println("Sei gegruesst!");
    }

    public String toString(){
        return super.toString();
    }

    public void heilt(Hobbit r){
        if (r.lebendig()){ // r.lebendig() == true <==> r.lebendig()
            r.setLebenserwartung(150);
            System.out.println(r.getName() + " hat wieder eine lebenserwartung von 150");
        }
        else{
            System.out.println(r.getName() + " kann nicht geheilt werden weil es schon gestorben ist");
        }
    }
}
