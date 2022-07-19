package Ab9;

public class Potenz {
    public static int powLoop(int a, int b)throws IllegalArgumentException{
        int i = 1;
        while (i < b){
            a*=a;
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(powLoop(3,2));
        System.out.println(Math.pow(3,2));
    }
}
