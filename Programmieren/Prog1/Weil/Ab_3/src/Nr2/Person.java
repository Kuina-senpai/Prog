package Nr2;

public class Person {
    private String name;
    private int geburtsJahr;
    private int geburtsMonat;
    private int geburtsTag;

    public Person() { }

    public Person (String s, int a){
        name = s;
        geburtsJahr = a;
    }

    public Person (String s, int a, int b, int c){
        name = s;
        geburtsJahr = a;
        geburtsMonat = b;
        geburtsTag = c;
    }
    public String getName(){
        return this.name;
    }

}
