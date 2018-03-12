
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        // Toteuta ohjelmasi tähän. 
        
        

        

        while (true) {

            System.out.println("Anna salasana:");

            String kysymys = lukija.nextLine();

            if (kysymys.equals("porkkana")) {
                System.out.println("Oikein");

                System.out.println("Salaisuus on XXXXXXX");
                break;

            } else {
                System.out.println("Väärin");

            }
        }

    }

}




    
