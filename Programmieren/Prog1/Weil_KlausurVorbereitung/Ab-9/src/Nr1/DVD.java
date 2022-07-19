package Nr1;

public class DVD extends Medium {
    private String titel;
    private int fsk;

    public DVD(String titel) {
        super(titel);
    }
    public DVD(String titel, int fsk){
        super(titel,fsk);
    }
    public String signatur(){
        return "DVD" + getNummer();
    }

}
