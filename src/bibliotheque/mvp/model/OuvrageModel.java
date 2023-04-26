package bibliotheque.mvp.model;
import bibliotheque.metier.Ouvrage;
import java.util.ArrayList;
import java.util.List;

public class OuvrageModel implements DAOOuvrage{

    private List<Ouvrage> ouvrages = new ArrayList<>();


    @Override
    public Ouvrage addOuvrage(Ouvrage ouv) {
        boolean present = ouvrages.contains(ouv);
        if (!present) {
            ouvrages.add(ouv);
            return ouv;
        } else return null;
    }

    @Override
    public boolean removeOuvrage(Ouvrage ouv) {
        return false;
    }

    @Override
    public Ouvrage updateOuvrage(Ouvrage ouv) {
        return null;
    }

    @Override
    public Ouvrage readOuvrage(String titre) {
        return null;
    }

    @Override
    public List<Ouvrage> getOuvrage() {
        return ouvrages;
    }
}
