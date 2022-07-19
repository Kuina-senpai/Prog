package Ab8;

public class Uhrzeit {
    private int std;
    private int min;

    private static String modus = "24std";

    public Uhrzeit(){
        /**std = 0; muss man eigentlich nicht machen es sind default werte die initialisiert werden, wenn kein wert übergeben wird
        min = 0;**/
        /** wenn man es genau nimmt, muss der default konstruktor nicht mal als code da stehen**/
    }
    public Uhrzeit(int std){
        this.std = std;
    }
    public Uhrzeit(int std, int min){
        this.std = std;
        this.min = min;
    }
    public Uhrzeit(Uhrzeit ref){
        this.std = ref.std;
        this.min = ref.min;
    }
    public int getStd(){
        return this.std;
    }
    public int getMin(){
        return this.min;
    }
    public boolean equals(Uhrzeit ref){
        return this.std == ref.std && this.min == ref.min;
    }
    public boolean istFrueher(Uhrzeit ref){
        if (this.std < ref.std){
            return true;
        }
        return this.std <= ref.std && this.min < ref.min;
    }
    public String toString() {
        if (modus.equals("24std")) {
            if (std < 10 && min < 10) { // wegen den return anweisungen muss dieser fall zuerst geprüft werden
                return "0" + std + ":0" + min; //falls nicht, dann wird es bei der ersten übereinstimmung returned ohne die anderen bedingungen weiter zu prüfen
            }
            if (std < 10) {
                return "0" + std + ":" + min;
            }
            if (min < 10) {
                return std + ":0" + min;
            }
            return std + ":" + min;
        }
        if (modus.equals("12std")) {
            if (std < 12) {
                if (std < 10 && min < 10) {
                    return "0" + std + ":0" + min + " am";
                }
                if (std < 10) {
                    return "0" + std + ":" + min + " am";
                }
                if (min < 10) {
                    return std + ":0" + min + " am";
                }
                return std + ":" + min + " am";
            }
            if (std >= 12){
                this.std -= 12;
                if (std < 10 && min < 10) {
                    return "0" + std + ":0" + min + " pm";
                }
                if (std < 10) {
                    return "0" + std + ":" + min + " pm";
                }
                if (min < 10) {
                    return std + ":0" + min + " pm";
                }
                return std + ":" + min + " pm";
            }
        }
        return "";
    }
    public void set12h24h(){
        if (modus.equals("24std")){
            modus = "12std";
            return;
        }
        if (modus.equals("12std")){
            modus = "24std";
        }
    }

    public static void main(String[] args) {
        Uhrzeit a = new Uhrzeit(13,3);
        a.set12h24h();
        a.set12h24h();
        System.out.println(a.toString());
    }

}
