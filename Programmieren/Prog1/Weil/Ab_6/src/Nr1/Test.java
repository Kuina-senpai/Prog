package Nr1;

public class Test {

    public static void main(String[] args) {

        Person leiterp1 = new Person("" ,2000);
        Person leiterp2 = new Person("Hasib" ,2000);
        Person leiterp3 = new Person("priesnitz",1970);



        Person a = new Person("Fabian" , 5 , 1 , 2001);
        Person b = new Person("huy" , 5 , 2 , 2001);
        Person c = new Person("Lukas" , 30 , 4 , 2003);
        Person d = new Person("shko" , 5 , 1 , 2001);
        Person e = new Person("emma" , 5 , 2 , 2001);
        Person f = new Person("ben" , 30 , 4 , 2003);

        Projekt p1 = new Projekt("Boxen" , leiterp1 , 3 , true);
        Projekt p2 = new Projekt("Lesen" , leiterp2 , 5 , true);

        Projekt p3 = new Projekt("Programmieren" , leiterp3 , 4 , true);

        System.out.println(c.anmelden(p1,c));
        System.out.println(d.anmelden(p1,d));
        System.out.println(e.anmelden(p1,e));
        p1.showTeilnehmer();
        System.out.println(p1.toString());
        //p1.showTeilnehmer2();
        //System.out.println(f.anmelden(p1,f));
        //System.out.println(a.anmelden(p1,a));
        //System.out.println(leiterp1.pruefedoplleteMitgliedschaft(p1,d));
        //System.out.println(leiterp1.setzePerson(p1,d));
        //System.out.println(leiterp1.setzePerson(p2,a));



    }
}
/*
die toString ausgabe kann nur funktionieren, wenn in der klasse x auch eine toString methode definiert ist.
beim Verwenden von zwei Klassen, die miteinander verknüpft sind müssen beide über eine toString verfügen.
Bei der ausgabe von Objekten innerhalb des arrays müssen auch die toString methoden aller verwendetet klassen definiert sein ,
ansonsten wird nur der speicherort des Objektes ausgegeben und nicht der inhalt.
 */