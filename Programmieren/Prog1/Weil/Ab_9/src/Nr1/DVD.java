package Nr1;

public class DVD extends Medium {
    private int fsk;


    public DVD(String signatur, String titel, int altersfreigabe) {
        super(signatur, titel) ;
        this.fsk = altersfreigabe;
    }

    public int getFsk(){
        return fsk;
    }

    public String toString(){
        return super.toString();
    }

}
