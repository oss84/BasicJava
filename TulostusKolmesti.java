
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mikä tulostetaan?");
        
        String nimi = lukija.nextLine(); 
        
        System.out.println(nimi + nimi + nimi);
        // Toteuta ohjelmasi tähän.

    }
}
