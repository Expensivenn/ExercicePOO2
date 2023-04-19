package bibliotheque.utilitaires;

import bibliotheque.metier.Auteur;

import java.util.Comparator;

public class AuteuComparator implements Comparator<Auteur> {
    @Override
    public int compare(Auteur o1, Auteur o2) {
        return (o1.getNom()+o1.getPrenom()).compareTo(o2.getNom()+o2.getPrenom());
    }
}
