package Nr1;

public class Nutzer extends Person {
    private static int ID_num = 100000;
    int nummer;

    public Medium[] liste = new Medium[10]; // länge 10, weil jeder nutzer max. 10 Objekte ausleihen kann
    public static int position = 0;

    public Nutzer(String name , int alter){
        super(name,alter);
        nummer = ID_num++;
    }

    public void ausleihen(DVD a) throws Exception{
        if(position == 10){
            throw new Exception("Nutzer: " + nummer + " hat die maximale anzahl an Objekten ausgeliehen");
        }
        if (getAlter() < a.getFsk()){
            throw new Exception(getName() + " ist nicht alt genug zum ausleihen von " + a.getTitel());
            // throw new Exception(getName() + " ist nicht alt genug zum ausleihen von " + a.getTitel())
        }
        if(a.getVerfügbarkeit()){ //äquivalent zu: a.getVerfügbarkeit()==true
            liste[position] = a; // das Objekt Medium wird in die liste hinzugefügt
            a.setVerfügbarkeit(false); // setzt die verfügbarkeit des Mediums auf false, somit ist es ausgeliehen
            position++;
        }
        else{
            throw new BibException(a.getTitel() + " ist bereits ausgeliehen");
        }
    }
    public void ausleihen(Buch a) throws Exception{
        if(position == 10){
            throw new BibException("Nutzer: " + nummer + " hat die maximale anzahl an Objekten ausgeliehen");
        }
        if(a.getVerfügbarkeit()){ //äquivalent zu: a.getVerfügbarkeit()==true
            liste[position] = a; // das Objekt Medium wird in die liste hinzugefügt
            a.setVerfügbarkeit(false); // setzt die verfügbarkeit des Mediums auf false, somit ist es ausgeliehen
            position++;
        }
        else{
            throw new BibException(a.getTitel() + " ist bereits ausgeliehen");
        }
    }
    public void ausleihListe(){
        System.out.println("Ausleiher des Mediums: " + nummer);
        for(int i = 0; i < liste.length; i++){
            System.out.println(liste[i]);
            System.out.println();
        }
    }
    public void rückgabeMedium(){
        for(int i = 0; i < position; i++){
            liste[i].setVerfügbarkeit(true);
            liste[i] = null;
        }
    }
    /**
    public void rückgabeMediumEinzeln(Medium a){
        a.setVerfügbarkeit(true);
        for(int i = 0; i < liste.length; i++){
            if(liste[i] == a){
                liste[i] = null;
            }
        }
    }
     */
    public String toString(){
        return super.toString() + " " + nummer;
    }
}

