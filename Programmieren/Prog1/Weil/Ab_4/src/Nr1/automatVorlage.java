package Nr1;

public class automatVorlage {

        // Instanz-Attribute
        private String standort;
        private double tarif;         // Preis pro Stunde
        private int anzahl = 0;       // verkaufte Tickets
        private double betrag = 0.0;  // durch Ticketverkauf eingenommer Geldbetrag


        // Konstruktor
        public automatVorlage(String ort, double t) {
            this.standort = ort;
            this.tarif = t;
        }

        // Instanz-Methoden
        public void erzeugeTicket(int zeit ,int a2Euro , int a1Euro , int a50cent) {
            double eingabe= (a2Euro * 2) + a1Euro + (a50cent * 0.5);
            if (eingabe <= 0) {
                System.out.println("ungültige Eingabe\n");
                System.out.println(" 4");
            }
            if ((zeit*tarif) > (eingabe)){
                System.out.println("nicht genügend Geld\n");
                System.out.println("4 ");
            }
            if (eingabe < tarif) {
                System.out.println("Kein Ticket , Hier ihr Rückgeld : \n" +
                        "Anzahl 2 Euro Münzen : " + a2Euro + "\n" +
                        "Anzahl 1 Euro Münzen : " + a1Euro + "\n" +
                        "Anzahl 50 Cent Münzen : " + a50cent + "\n" +
                        "Rückgeld gesamt : " + eingabe);
            }
            if (eingabe >= tarif){
                int std = 0;
                double rückgeld = 0;
                double temp = eingabe;
                while (temp >= tarif * zeit){
                    temp -= tarif;
                    std++;
                    if (temp < tarif){
                        System.out.println("Der Betrag: " + eingabe + " ermöglichst eine Parkdauer von: " + std + "std");
                        rückgeld = temp;
                        return;
                    }
                }
                anzahl = anzahl+1;
                betrag = betrag + zeit*tarif;
                System.out.println("Ticket fuer " + this.standort + "\t Dauer: " + zeit + " Std.");
                System.out.println("Eingeworfener betrag: " + eingabe);
                int a2 = 0;
                int a1 = 0;
                int a05 = 0;
                double tmp2 = rückgeld;
                if (tmp2 > 2){
                    while (tmp2 >= 0.5){
                        if (tmp2 >= 2){ // zählt die möglichen 2 euro stücke im rückgeld
                            temp -= 2;
                            a2++;
                        }
                        if (tmp2 < 2 && rückgeld >= 1){ // zählt die möglichen 1 euro stücke im rückgeld
                            tmp2 -= 1;
                            a1++;
                        }else{
                            tmp2 -= 0.5;
                            a05++;
                        }
                    }
                }
                System.out.println("Ihr Rückgeld: " + rückgeld);
                System.out.println("Ausgabe Rückgeld in folgender form : \n" +
                                   "Anzahl der 2 Euro Stücke: " + a2 + "\n" +
                                   "Anzahl der 2 Euro Stücke: " + a1 + "\n" +
                                   "Anzahl der 50 Cent Stücke: " + a05);
            }

        }
        public double getTarif() {
            return this.tarif;
        }

        public void setTarif(double t) {
            this.tarif = t;
        }

        public int getAnzahl() {
            return this.anzahl;
        }

        public double getBetrag() {
            return this.betrag;
        }

        public String getOrt() {
            return this.standort;
        }

        public double mittlereParkdauer() {
            // ermittelt die durchschnittliche Parkdauer
            return betrag/(tarif*anzahl);
        }

        public String toString() {
            String s = "Automat " + this.standort + "\t Tarif: " + tarif + "\n";
            return s;
        }

        public void showStatus() {
            String s = this.toString();
            s = s + "Anzahl verkaufter Tickets: " + anzahl + "\n";
            s = s + "eingenommen: " + betrag + "\n";
            s = s + "durchschnittliche Parkdauer: " + mittlereParkdauer() + "\n";
            System.out.println(s);
        }

}
