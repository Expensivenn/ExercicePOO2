package bibliotheque.utilitaires;

import bibliotheque.metier.Rayon;

import java.util.Comparator;

public class RayonComparator implements Comparator<Rayon> {
    @Override
    public int compare(Rayon o1, Rayon o2) {
        String r1 = o1.getCodeRayon();
        String r2 = o2.getCodeRayon();
        return r1.compareTo(r2);
    }
}
