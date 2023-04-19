package bibliotheque.mvp.model;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Ouvrage;

import java.util.List;

public interface DAOOuvrage {
    Ouvrage addOuvrage(Ouvrage ouv);

    boolean removeOuvrage(Ouvrage ouv);
    Ouvrage updateOuvrage(Ouvrage ouv);

    Ouvrage readOuvrage(String titre);

    List<Ouvrage> getOuvrage();

}
