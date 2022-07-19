package Nr2;

public abstract class Wesen {
    private String name;
    private int alter;
    private Tragbar ding; //Tragbar kann verwendet werden wie ein Objekt, denn es ist ein normaler rückgabe typ
    public Wesen(String name, int alter){
        this.name = name;
        this.alter = alter;
    }
    public abstract boolean lebendig();
    //def von Hobbit/Magier ref hier nicht nötig
    //das programm erkennt, was für ein typ das objekt ist und gibt dem entsprechend die
    // → in der jeweiligen klasse definierte methode aus

    public abstract String gruss();

    public String toString(){
        return "Name: " + name + "\n" +
                "Alter: " + alter + "\n";
    }

    public abstract void nehmen(Tragbar a); // wird in hobbit und Magier implementiert

    public Tragbar tragen(){ //zeigt, was ich trage
        return ding;
    }

    public void setDing(Tragbar ding) {
        this.ding = ding;
    }

    public Tragbar getDing() {
        return ding;
    }

    public int getAlter() {
        return alter;
    }
    public String getName() {
        return name;
    }

}
