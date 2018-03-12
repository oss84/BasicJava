
import java.util.Scanner;

public class IkienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kerro nimi"); 
        
        String nimi = lukija.nextLine();
        
        System.out.println("Kerro ikä");
        
        int ika = Integer.parseInt(lukija.nextLine()); 
        
        System.out.println("Kerro nimi"); 
        
        String name = lukija.nextLine(); 
        
        System.out.println("Kerro ikä"); 
        
        int age = Integer.parseInt(lukija.nextLine()); 
        
        System.out.println(nimi + " ja " + name + " ovat yhteensä " + (ika + age) + " vuotta vanhoja ");
        
        
        
        // Toteuta ohjelmasi tähän.
    }
}
