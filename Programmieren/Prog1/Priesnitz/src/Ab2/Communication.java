package Ab2;

public class Communication {
    public static String greeting(String name){
        return "Hallo " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greeting("World"));
    }
}
