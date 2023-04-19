package bibliotheque.mvp;

import bibliotheque.mvp.model.DAOLecteur;
import bibliotheque.mvp.model.DAOOuvrage;
import bibliotheque.mvp.model.LecteurModel;
import bibliotheque.mvp.model.OuvrageModel;
import bibliotheque.mvp.presenter.LecteurPresenter;
import bibliotheque.mvp.presenter.OuvragePresenter;
import bibliotheque.mvp.view.LecteurViewConsole;
import bibliotheque.mvp.view.LecteurViewInterface;
import bibliotheque.mvp.view.OuvrageViewConsole;
import bibliotheque.utilitaires.Utilitaire;

import java.util.Arrays;
import java.util.List;

public class GestBiblio {

    private DAOLecteur lm;
    private DAOOuvrage om;
    private LecteurViewInterface lv;
    private OuvrageViewConsole ov;
    private LecteurPresenter lp;
    private OuvragePresenter op;



    public void gestion(){
        lm = new LecteurModel();
        lv = new LecteurViewConsole();
        lp = new LecteurPresenter(lm, lv);//création et injection de dépendance

        List<String> loptions = Arrays.asList("lecteurs","fin");
        do {
            int ch = Utilitaire.choixListe(loptions);
            switch (ch){
                case 1: lp.start();
                    break;
                case 2 : System.exit(0);
            }
        }while(true);
    }
    public void gestionOuv(){
        om = new OuvrageModel();
        ov = new OuvrageViewConsole();
        op = new OuvragePresenter(om,ov);
        List<String> loptions = Arrays.asList("Ouvrages","fin");
        do {
            int ch = Utilitaire.choixListe(loptions);
            switch (ch){
                case 1: op.start();
                    break;
                case 2 : System.exit(0);
            }
        }while(true);

    }
    public static void main(String[] args) {
        GestBiblio gb = new GestBiblio();
        gb.gestionOuv();
    }
}
