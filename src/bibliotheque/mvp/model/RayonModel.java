package bibliotheque.mvp.model;

import bibliotheque.metier.Exemplaire;
import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Rayon;

import java.util.ArrayList;
import java.util.List;

public class RayonModel implements DAORayon {
    private List<Rayon> rayons = new ArrayList<>();

    @Override
    public Rayon addRayon(Rayon rayon) {
        boolean present = rayons.contains(rayon);
        if (!present) {
            rayons.add(rayon);
            return rayon;
        } else return null;
    }

    @Override
    public boolean removeRayon(Rayon rayon) {
        return rayons.remove(rayon);
    }

    @Override
    public Rayon updateRayon(Rayon rayon) {
        int p = rayons.indexOf(rayon);
        if (p < 0) return null;
        rayons.set(p, rayon); // remplacement du rayon à la même position
        return rayon;
    }

    @Override
    public Rayon readRayon(int idRayon) {
        for (Rayon r : rayons) {
            if (r.getCodeRayon() == idRayon) return r;
        }
        return null;
    }


    @Override
    public List<Rayon> getRayons() {
        return rayons;
    }
}
