package Nr1;

public abstract class Medium {

    private String signatur; //Buch oder DVD
    private String titel;
    private static int nummer_class = 111111;
    int  nummer; //so hat jedes Objekt seine eigene nummer gespeichert

    private boolean verfügbarkeit = true;

    public Medium(String a , String b){
        signatur = a;
        titel = b;
        nummer = nummer_class++;
    }

    public String toString() {
        if (signatur.equals("Buch")){
            signatur = "B";
        }
        return  signatur + " " + titel + "\n" +
                nummer;
    }
    public void setSignature(String s){
        signatur = s;
    }
    public String getSignatur(){
        return signatur;
    }
    public String getTitel(){
        return titel;
    }
    public int getNummer(){
        return nummer;
    }
    public boolean getVerfügbarkeit(){
        return verfügbarkeit;
    }
    public void setVerfügbarkeit(boolean a){
        verfügbarkeit = a;
    }
}
