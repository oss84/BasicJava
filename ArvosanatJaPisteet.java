
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet 0 - 100 :");

        int pisteet = Integer.parseInt(lukija.nextLine());

        if (pisteet < 0) {

            System.out.println(" Mahdotonta");

        } else if (pisteet <= 74) {

            System.out.println(" Hylätty ");

        } else if (pisteet <= 89) {

            System.out.println(" Hyväksytty ");

        } else if (pisteet <= 100) {

            System.out.println(" 5");

        } else if (pisteet > 100) {

            System.out.println(" Uskomatonta");
        }

    }
}
