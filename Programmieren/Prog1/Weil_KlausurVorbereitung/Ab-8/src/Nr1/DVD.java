package Nr1;

public class DVD extends Medium {
    private String titel;

    public DVD(String titel) {
        super(titel);
    }
    public String signatur(){
        return "DVD" + getNummer();
    }

}
