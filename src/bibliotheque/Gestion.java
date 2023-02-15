package bibliotheque;

import java.time.LocalDate;
import java.util.List;

public class Gestion {
    public static void main(String[] args){
        LocalDate dt = LocalDate.of(2020,12,15);
        LocalDate dt1 = LocalDate.of(2020,8,15);
        LocalDate dt2 = LocalDate.of(2020,7,15);
        Auteur aut = new Auteur("Musso","Guillaume","Belge");
        Livre liv = new Livre("titre",10,dt,15.25,"Fr","Policier","978 - 2 - 7177 - 2113 - 4",254,TypeLivre.ROMAN,"resumé");
        //aut.getLouvrage().add(liv);
        //liv.getLauteurs().add(aut);
        //A definir :
        aut.addOuvr(liv);
        Rayon ray = new Rayon("Be023","Policier");
        Exemplaire ex = new Exemplaire("201881","occasion",liv);
        ex.setRayon(ray);
        liv.getLex().add(ex);
        Lecteur lec = new Lecteur(25,"Ruitenbeek","Cedric",dt,"25c Pommeroeul","@gmail","0495181269");
        Location loc = new Location(dt2,dt1,lec,ex);
        lec.getLloc().add(loc);
        ex.getLloc().add(loc);
        System.out.println(aut);
        System.out.println(liv);
        System.out.println(liv.getLauteurs());
        aut.suppOuvr(liv);
        System.out.println("---------------");
        System.out.println(liv.getLauteurs());

    }
}
