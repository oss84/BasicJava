
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int luettu;

        int summa = 0;

        System.out.println("Anna ensimmäinen luku");
        luettu = Integer.parseInt(lukija.nextLine());
        System.out.println("Anna toinen luku");
        luettu = luettu + Integer.parseInt(lukija.nextLine());
        System.out.println("Anna kolmas luku");
        luettu = luettu + Integer.parseInt(lukija.nextLine());

        summa = luettu;

        System.out.println("Summa: " + summa);
        // KIRJOITA OHJELMA TÄHÄN
        // ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija, summa JA luettu!

    }
}
