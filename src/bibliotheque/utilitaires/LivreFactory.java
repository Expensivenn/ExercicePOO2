package bibliotheque.utilitaires;

import bibliotheque.metier.Livre;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeLivre;
import bibliotheque.metier.TypeOuvrage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LivreFactory extends OuvrageFactory {
    public Ouvrage addDetail(String titre, int ageMin, LocalDate dateParution, double prixLocation, String langue, String genre) {
        int nbrePages=0;
        System.out.println("isbn ");
        String isbn = sc.nextLine();
        System.out.println("pages ");
        String snbrePages = sc.nextLine();
        try {
            nbrePages = Integer.parseInt(snbrePages);
        } catch (NumberFormatException e) {
            System.out.println("nombre incorrect");
        }
        TypeLivre[] ttl = TypeLivre.values();
        List<TypeLivre> ltl = new ArrayList<>(Arrays.asList(ttl));
        int choix = Utilitaire.choixListe(ltl);
        TypeLivre tl = ttl[choix - 1];
        System.out.println("résumé du livre :");
        String resume = sc.nextLine();
        Livre l = new Livre(titre, ageMin, dateParution, prixLocation, langue, genre, isbn, nbrePages, tl, resume);
        return l;
    }
}
