package Nr1;

public class Buch extends Medium{
    private String titel;

    public Buch(String titel){
        super(titel);
    }
    public String signatur() {
        return "B" + getNummer();
    }
}
