package bibliotheque.utilitaires;

import bibliotheque.metier.Lecteur;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class LecteurComparator implements Comparator<Lecteur> {

    @Override
    public int compare(Lecteur o1, Lecteur o2) {
        String lec1 = (o1.getNom()+o1.getPrenom()).trim();
        String lec2 = (o2.getNom()+o2.getPrenom()).trim();
        return lec1.compareTo(lec2);
    }
}
