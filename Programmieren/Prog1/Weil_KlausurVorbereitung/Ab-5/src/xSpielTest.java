import java.util.Scanner;

public class xSpielTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ihren namen ein");
        String name = sc.next();
        xSpieler a = new xSpieler("Computer");
        xSpieler b = new xSpieler(name);

        //xSpiel.simplesSpiel(a,b);
        //xSpiel.filzlaus(a,b);
        //xSpiel.pasch(a,b);
        xSpiel.hausnummer(b);
    }
}
