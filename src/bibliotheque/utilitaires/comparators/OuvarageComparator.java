package bibliotheque.utilitaires;

import bibliotheque.metier.Ouvrage;

import java.util.Comparator;

public class OuvarageComparator implements Comparator<Ouvrage> {
    @Override
    public int compare(Ouvrage o1, Ouvrage o2) {
        String t1 = o1.getTitre();
        String t2 = o2.getTitre();
        return t1.compareTo(t2);
    }
}
