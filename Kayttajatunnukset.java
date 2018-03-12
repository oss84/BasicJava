
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna tunnus");

        String tunnus = lukija.nextLine();

        System.out.println("Anna salasana");

        String passu = lukija.nextLine();

        
        if (tunnus.equals("aleksi") && passu.equals("tappara") || 
            tunnus.equals("elina") && passu.equals("kissa")) {

            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana");
        }
    }

}
