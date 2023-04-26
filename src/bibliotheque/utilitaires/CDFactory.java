package bibliotheque.utilitaires;

import bibliotheque.metier.CD;
import bibliotheque.metier.DVD;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeOuvrage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CDFactory extends OuvrageFactory{
    public Ouvrage addDetail(String titre, int ageMin, LocalDate dateParution, double prixLocation, String langue, String genre){
        long code = 0;
        byte nbrePlages = 0;
        System.out.println("code : ");
        String scode= sc.nextLine();
        try {
            code =Long.parseLong(scode);

        }catch(NumberFormatException e) {
            System.out.println("code invalide!");
        }
        System.out.println("nombre de plages :");
        String snbrePlages= sc.nextLine();
        try {
            nbrePlages =Byte.parseByte(snbrePlages);

        }catch(NumberFormatException e) {
            System.out.println("nombre invalide!");
        }
        System.out.println("durée en H M S : ");
        LocalTime dureeTotale = Utilitaire.lecTime();
        CD cd =new CD(titre,ageMin,dateParution,prixLocation,langue,genre,code,nbrePlages,dureeTotale);
        return cd;
    }
}
