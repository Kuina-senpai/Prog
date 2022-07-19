package Nr2;

public abstract class  Wesen { // die klasse wird als abstract Oberklasse dienen

    private String name;
    private int alter;

    public Wesen(String name, int age){
        this.name = name;
        alter = age;
    }

    public abstract boolean lebendig(); //abstract methode hier keinen methoden körper

    public abstract void gruss();

    public int getAlter(){
        return alter;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name + " " + alter;
    }
}
