
import java.util.Scanner;

public class Jakaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku");

        int eka = Integer.parseInt(lukija.nextLine());

        System.out.println("Anna toinen luku");

        int toka = Integer.parseInt(lukija.nextLine());

        //   System.out.println("Jakolasku:" + (eka / (double)toka));
        System.out.println("Jakolasku: " + eka + " / " + toka + " = " + eka / (double) toka);

     
     
        // Toteuta ohjelmasi tähän. Muista kysyä luvut käyttäjältä!
    }
}
