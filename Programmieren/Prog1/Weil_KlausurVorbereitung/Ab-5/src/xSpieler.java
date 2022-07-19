public class xSpieler {
    private würfel a = new würfel();
    private String name;
    private int punktzahl =  0;

    public xSpieler(String name){
        this.name = name;
    }
    public int punkte(){
        return punktzahl;
    }
    public void punktPlus(){
        this.punktzahl++;
    }
    public void punktPlus(int n){
        this.punktzahl += n;
    }
    public void reset(){
        this.punktzahl = 0;
    }
    public int wuerfeln(){
         return a.wuerfeln();
    }
    public String toString(){
        return "Name: " + name + "  " + "Punktestand: " + punktzahl;
    }

    public int getPunktzahl() {
        return punktzahl;
    }

    public String getName(){
        return name;
    }
}
