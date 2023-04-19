package bibliotheque.mvp.view;

import bibliotheque.metier.Lecteur;
import bibliotheque.metier.Ouvrage;
import bibliotheque.metier.TypeOuvrage;
import bibliotheque.mvp.presenter.LecteurPresenter;
import bibliotheque.mvp.presenter.OuvragePresenter;
import bibliotheque.utilitaires.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static bibliotheque.utilitaires.Utilitaire.affListe;
import static bibliotheque.utilitaires.Utilitaire.choixListe;

public class OuvrageViewConsole implements OuvrageViewInterface{

    private OuvragePresenter presenter;
    private List<Ouvrage> louv;
    private Scanner sc = new Scanner(System.in);

    public OuvrageViewConsole() {

    }


    @Override
    public void setPresenter(OuvragePresenter presenter) {
            this.presenter = presenter;
    }

    @Override
    public void setListDatas(List<Ouvrage> ouvrages) {
        this.louv = ouvrages;
        affListe(louv);
        menu();
    }
    public void menu(){
        List options = new ArrayList<>(Arrays.asList("ajouter", "retirer", "rechercher","modifier","special","fin"));
        do {
            int ch = choixListe(options);

            switch (ch) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    //retirer();
                    break;
                case 3:
                    //rechercher();
                    break;
                case 4:
                    //modifier();
                    break;
                case 5:
                    //special();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
    public void ajouter(){
        TypeOuvrage[] tto = TypeOuvrage.values();
        List<TypeOuvrage> lto = new ArrayList<>(Arrays.asList(tto));
        int choix = Utilitaire.choixListe(lto);
        Ouvrage o;
        List<OuvrageFactory> lof = new ArrayList<>(Arrays.asList(new LivreFactory(),new CDFactory(),new DVDFactory()));
        o = lof.get(choix-1).create();
        this.louv.add(o);
        presenter.addOuvrage(o);
        //TODO attribuer auteurs, les auteur sont triés par odre de nom et prénom, empêcher doublons
    }

    @Override
    public void affMsg(String msg) {

    }

    @Override
    public void affList(List<Ouvrage> louv) {

    }
}
