
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.asetaLaatikkoSatunnaisesti();
        Ohjain.kaynnista();

        // kertoo robotin x- ja y-koordinaatit
        int robottiX = Ohjain.robottiX();
        int robottiY = Ohjain.robottiY();

// kertoo laatikon x- ja y-koordinaatit
        int laatikkoX = Ohjain.laatikkoX();
        int laatikkoY = Ohjain.laatikkoY();

// kertoo rahtialueen x- ja y-koordinaatit
        int tavoiteX = Ohjain.tavoiteX();
        int tavoiteY = Ohjain.tavoiteY();

        while (true) {
            System.out.println("Komento(sammuta,vasen,oikea,liiku,liikuMonta, viereen)");

            String komento = lukija.nextLine();

            if (komento.equals("sammuta")) {
                Ohjain.sammuta();
                break;

            } else if (komento.equals("vasen")) {
                Ohjain.vasen();

            } else if (komento.equals("oikea")) {
                Ohjain.oikea();

            } else if (komento.equals("liiku")) {
                Ohjain.liiku();

            } else if (komento.equals("liikuMonta")) {
                System.out.println("Kuinka monta askelta?");
                int askel = Integer.parseInt(lukija.nextLine());
                Ohjain.liikuMonta(askel);

            } else if (komento.equals("viereen")) {
                Ohjain.liikuMonta(laatikkoX - 2);
                Ohjain.vasen();
                Ohjain.liikuMonta(laatikkoY - 1);
            } else if (komento.equals("ratkaise")) {
                Ohjain.liikuMonta(laatikkoX - 2);
                Ohjain.vasen();
                Ohjain.liikuMonta(laatikkoY - 1);
                Ohjain.liiku();
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.oikea();
                Ohjain.liikuMonta(laatikkoY - tavoiteY);
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.vasen();
                Ohjain.liiku();
                Ohjain.vasen();
                Ohjain.liikuMonta(tavoiteX - laatikkoX);
            }

        }

    }
}
