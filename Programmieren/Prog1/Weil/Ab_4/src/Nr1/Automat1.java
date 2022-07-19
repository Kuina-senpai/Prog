package Nr1;

public class Automat1 {
    
        // Instanz-Attribute
        private String standort;
        private double tarif;         // Preis pro Stunde
        private int anzahl = 0;       // verkaufte Tickets
        private double einnahmen = 0.0;   // durch Ticketverkauf eingenommen Geldbetrag
        private static double betrag = 0.0;

        // Konstruktor
        public Automat1(String ort, double t) {
            this.standort = ort;
            this.tarif = t;
        }

        // Instanz-Methoden
        public void erzeugeTicket(int a , int b , int c) {
            this.betrag = (a*2) + b + (c*0.5);
            if (betrag <= 0){
                System.out.println("Ungültige Eingabe");
                System.out.println();
            }

            if (betrag < tarif){
                System.out.println("Kein Ticket");
                System.out.println("Rückgeld: " + betrag);
                System.out.println();
            }

            if (betrag >= tarif){
                System.out.println("Standort: " + standort + "\n" +
                                   "Parkdauer: " + Parkdauer() + "\n" +
                                   "Preis des Tickets: " + (tarif * Parkdauer()));

                anzahl = anzahl + 1;
                einnahmen += Parkdauer()*tarif;
            }
        }

        public int Parkdauer(){ //Hilfsmethode
            double temp = this.betrag;
            int std = 0;
            while(temp >= tarif){
                temp -= tarif;
                std++;
            }
            return std;
        }

        public void Rückgeld(){ //Hilfsmethode
            double summe = this.betrag; // Eingeworfener betrag
            double kosten = Parkdauer() * tarif;
            double differenz = summe - kosten;
            System.out.println("Ihr Rückgeld : $" + differenz);
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

        public double getEinnahmen() {
            return this.einnahmen;
        }

        public String getOrt() {
            return this.standort;
        }

        public double mittlereParkdauer() {
            // ermittelt die durchschnittliche Parkdauer
            return einnahmen/(tarif*anzahl);
        }

        public String toString() {
            String s = "Automat " + this.standort + "\t Tarif: " + tarif + "\n";
            return s;
        }

        public void showStatus() {
            String s = this.toString();
            s = s + "Anzahl verkaufter Tickets: " + anzahl + "\n";
            s = s + "eingenommen: " + einnahmen + "\n";
            s = s + "durchschnittliche Parkdauer: " + mittlereParkdauer() + "\n";
            System.out.println(s);
        }
}
