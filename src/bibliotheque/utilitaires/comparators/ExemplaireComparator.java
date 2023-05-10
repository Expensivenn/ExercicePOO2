package bibliotheque.utilitaires;

import bibliotheque.metier.Exemplaire;

import java.util.Comparator;

public class ExemplaireComparator implements Comparator<Exemplaire> {
    @Override
    public int compare(Exemplaire o1, Exemplaire o2) {
        String e1 = o1.getMatricule();
        String e2 = o2.getMatricule();
        return e1.compareTo(e2);
    }
}
