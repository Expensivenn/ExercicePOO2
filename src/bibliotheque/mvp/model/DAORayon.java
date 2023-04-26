package bibliotheque.mvp.model;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Rayon;

import java.util.List;

public interface DAORayon {
    Rayon addRayon(Rayon rayon);

    boolean removeRayon(Rayon rayon);
    Rayon updateRayon(Rayon rayon);

    Rayon readRayon(int idRayon);

    List<Rayon> getRayons();
}

