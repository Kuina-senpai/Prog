package Nr0;

public class TestStudentPerson {
	
	public static void main(String[] args) {
		test0();
	}
	
	public static void test0() {
		Person p = new Person("Paul", 1957);
		Student s = new Student("Susi", 1990);
		System.out.println(p);
		System.out.println(s);
	}
	
	public static void test1() {
		Person p = new Person("Paul", 1957);
		Student s = new Student("Susi", 1990);
		
		Person[] pGruppe = new Person[10];
		Student[] sGruppe = new Student[30];
		
		pGruppe[0] = p;  // ok
		pGruppe[1] = s;  // ok
		pGruppe = sGruppe; // auch ok
		// das geht nicht:
		/*
		sGruppe[0] = p;
		sGruppe = pGruppe;
		*/
	}

}