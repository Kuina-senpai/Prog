package Nr1alternative;

public class AutomatTest {
	
	public static void main(String[] args) {
		test2();
	}
	
	public static void test2() {
		Automat2 a = new Automat2 ("Hbf", 2.5);
		System.out.println(a + "\n");
		System.out.println("Eingabe 0, 0, -1");
		a.erzeugeTicket(0, 0, -1); 
		System.out.println("Eingabe 0, 0, 2");
		a.erzeugeTicket(0, 0, 2);
		System.out.println("Eingabe 4, 0, 2");
		a.erzeugeTicket(4, 0, 2);
	}
	
	public static void test1() {
		Automat1 a1 = new Automat1("Schlossallee", 1.5);
		Automat1 a2 = new Automat1("Parkstrasse ", 2.0);
		
		a2.erzeugeTicket(3);
		a1.erzeugeTicket(1);
		a1.erzeugeTicket(1);
		a1.erzeugeTicket(1);
		a2.erzeugeTicket(2);
		a1.erzeugeTicket(1);
		a2.erzeugeTicket(2);
		a2.erzeugeTicket(3);
		System.out.println();
		a1.showStatus();
		a2.showStatus();
	}

}
