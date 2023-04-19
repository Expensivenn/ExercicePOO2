package bibliotheque.mvp.presenter;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Ouvrage;
import bibliotheque.mvp.model.DAOLecteur;
import bibliotheque.mvp.model.DAOOuvrage;
import bibliotheque.mvp.view.LecteurViewInterface;
import bibliotheque.mvp.view.OuvrageViewInterface;

import java.util.List;

public class OuvragePresenter {
    private DAOOuvrage model;
    private OuvrageViewInterface view;

    public OuvragePresenter(DAOOuvrage model, OuvrageViewInterface view) {
        this.model = model;
        this.view = view;
        this.view.setPresenter(this);
    }

    public void start() {
        view.setListDatas(getAll());
    }

    public List<Ouvrage> getAll(){
        return model.getOuvrage();
    }

    public void addOuvrage(Ouvrage o) {
        Ouvrage ouv = model.addOuvrage(o);
        if(ouv!=null) view.affMsg("création de :"+ouv);
        else view.affMsg("erreur de création");
    }

}
