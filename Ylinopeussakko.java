
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("kerro nopeus"); 
        
        int nopeus = Integer.parseInt(lukija.nextLine()); 
        
        if ( nopeus > 120) {
            
            System.out.println("Ylinopeussakko");
        
        }

        // Toteuta ohjelmasi tähän. 
    }
}
