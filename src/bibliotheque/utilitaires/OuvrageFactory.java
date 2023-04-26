package bibliotheque.utilitaires;


import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeOuvrage;

import java.time.LocalDate;
import java.util.Scanner;

public  abstract class OuvrageFactory {
   protected Scanner sc= new Scanner(System.in);
   public Ouvrage create() {
       int ageMin = 0;
       double prix = 0;
       System.out.println("titre");
       String titre= sc.nextLine();
       System.out.println("age minimum");
       String sAgeMin= sc.nextLine();
       try {
           ageMin =Integer.parseInt(sAgeMin);

       }catch(NumberFormatException e) {
           System.out.println("nombre invalide!");
       }
       System.out.println("date de parution");
       LocalDate dp= Utilitaire.lecDate();
       System.out.println("prix de location");
       String sPrix = sc.nextLine();
       try {
           prix =Double.parseDouble(sPrix);

       }catch(NumberFormatException e) {
           System.out.println("prix invalide!");
       }
       System.out.println("langue");
       String langue=sc.nextLine();
       System.out.println("genre");
       String genre=sc.nextLine();
       return addDetail(titre,ageMin,dp,prix, langue,  genre);
    }

    public abstract Ouvrage addDetail(String titre, int ageMin, LocalDate dateParution, double prixLocation, String langue, String genre);
}