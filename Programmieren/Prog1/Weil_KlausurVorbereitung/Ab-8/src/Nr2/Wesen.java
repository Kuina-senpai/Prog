package Nr2;

public abstract class Wesen {
    private String name;
    private int alter;
    public Wesen(String name, int alter){
        this.name = name;
        this.alter = alter;
    }
    public abstract boolean lebendig();
    //def von Hobbit/Magier ref hier nicht nötig
    //das programm erkennt, was für ein typ das objekt ist und gibt dem entsprechend die
    // → in der jeweiligen klasse definierte methode aus

    public abstract String gruss();
    public int getAlter() {
        return alter;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return "Name: " + name + "\n" +
                "Alter: " + alter + "\n";
    }
}
