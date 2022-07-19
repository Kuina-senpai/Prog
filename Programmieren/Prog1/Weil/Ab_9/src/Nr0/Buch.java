package Nr0;

public class  Buch extends Medium {

    public Buch(String signatur , String titel){ // konstruktor muss mind. so aufgebaut sein wie der in der Oberklasse
        super(signatur,titel); // fügt die hier eingegeben Werte der Oberklasse zu
    }

    public String toString(){
        return super.toString();
        //füge hier Personalisiertes hinzu und füge es mit "super"(greift auf die oberklasse zu)
        // der toString methode der Oberklasse hinzu
    }
}
