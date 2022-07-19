package Nr1alternative;

public class Test {
	public static void main (String[] args) {
		
		Nutzer a = new Nutzer();
		Nutzer b = new Nutzer();
		
		Buch b1 = new Buch("HerryPotter");
		Buch b2 = new Buch("Insel");
		Buch b3 = new Buch("ABC");
		Buch b4 = new Buch("HMFF");
		Buch b5 = new Buch("MUsicBuch");
		
		DVD D1 = new DVD("Movie");
		DVD D2 = new DVD("Star World");
		DVD D3 = new DVD("M1");
		DVD D4 = new DVD("M2");
		DVD D5 = new DVD("M3");
		DVD D6 = new DVD("M4");
		
		a.ausleihen(D1);
		a.ausleihen(D2);
		a.ausleihen(D3);
		a.ausleihen(D4);
		a.ausleihen(D5);
		a.ausleihen(D6);
		a.ausleihen(b1);
		a.ausleihen(b2);
		a.ausleihen(b3);
		a.ausleihen(b4);
		
		
		System.out.println(a.ausleihen(b5));
		a.printListe();
		System.out.println(b.ausleihen(b5));
		System.out.println(b.ausleihen(D6));
		b.printListe();
		
		System.out.println(a.getiD());
		System.out.println(b.getiD());
		
		System.out.println(b4.getAusleiher().getiD());
	}
	
}
