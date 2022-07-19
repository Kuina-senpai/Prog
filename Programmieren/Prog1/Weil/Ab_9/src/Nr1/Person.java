package Nr1;

public class Person {
    private String name;
    private int alter;

    public Person(String namex , int alterx){
        name = namex;
        alter = alterx;
    }
    public String getName(){
        return name;
    }
    public int getAlter(){
        return alter;
    }

    public String toString(){
        return name + " " + alter;
    }
}
