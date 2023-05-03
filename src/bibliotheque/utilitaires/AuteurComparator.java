package bibliotheque.utilitaires;

import bibliotheque.metier.Auteur;

import java.util.Comparator;

public class AuteurComparator implements Comparator<Auteur> {
    @Override
    public int compare(Auteur o1, Auteur o2) {
        String a1 = (o1.getNom()+o1.getPrenom()).trim();
        String a2 = (o2.getNom()+o2.getPrenom()).trim();
        return a1.compareTo(a2);
    }
}
