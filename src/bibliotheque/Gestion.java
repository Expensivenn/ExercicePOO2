package bibliotheque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestion {

    Scanner sc = new Scanner(System.in);
    private static List<Auteur> laut = new ArrayList<>();
    private static List<Lecteur> llect = new ArrayList<>();
    private static List<Ouvrage> louv = new ArrayList<>();
    private static List<Exemplaire> lex = new ArrayList<>();
    private static List<Rayon> lrayon = new ArrayList<>();
    private static List<Location> lloc = new ArrayList<>();

    public static Auteur encoderAuteur() {
        boolean x;
        String erreur ="Erreur ne commence pas par une Maj";
        String nameTmp;
        String firstnameTmp;
        String nationalityTmp;
        Auteur a = new Auteur();
        do {
            x = true;
            nameTmp = verifEntreeBoucle("[A-Z][A-Za-z]+", "Entrez le nom :", erreur);
            firstnameTmp = verifEntreeBoucle("[A-Z][A-Za-z]+", "Entrez le prénom :", erreur);
            nationalityTmp = verifEntreeBoucle("[A-Z][A-Za-z]+","Entrez la nationalité :", erreur);
            a.setNationalite(nationalityTmp);
            a.setPrenom(firstnameTmp);
            a.setNom(nameTmp);
            if (laut.contains(a)) {
                System.out.println("Auteur existant! Réitérer la saisie :");
                x = false;
            }
        } while (!x);

        return a;
    }
    public static void addAuteur(){
        Auteur a = encoderAuteur();
        laut.add(a);
    }
    public static Ouvrage encoderOuvrage(){
        int choix;
        String option;
        do {
            listOuvr();
            option = verifEntreeBoucle("[1-3]","Entrez un chiffre","Pas entre 1 et 5 !");
            choix = Integer.parseInt(option);
            switch (choix) {
                case 1 -> //cd;//menuDeux
                case 2 -> //dvd;
                case 3 -> //livre;
            }
        } while (choix != 3);
    }

    public static void populate() {
        Auteur a = new Auteur("Verne", "Jules", "France");
        laut.add(a);

        Livre l = new Livre("Vingt mille lieues sous les mers", 10, LocalDate.of(1880, 1, 1), 1.50, "français", "aventure", "a125", 350, TypeLivre.ROMAN, "histoire de sous-marin");
        louv.add(l);

        a.addOuvrage(l);

        a = new Auteur("Spielberg", "Steven", "USA");
        laut.add(a);

        DVD d = new DVD("AI", 12, LocalDate.of(2000, 10, 1), 2.50, "anglais", "SF", 4578l, "120 min", (byte) 2);
        d.addLangue("français");
        d.addLangue("italien");
        d.addSousTitre("néerlandais");
        louv.add(d);

        a.addOuvrage(d);

        a = new Auteur("Kubrick", "Stanley", "GB");
        laut.add(a);

        a.addOuvrage(d);

        CD c = new CD("The Compil 2023", 0, LocalDate.of(2023, 1, 1), 2, "English", "POP", 1245, (byte) 20, "100 min");
        louv.add(c);

        Rayon r = new Rayon("r12", "aventure");
        lrayon.add(r);

        Exemplaire e = new Exemplaire("m12", "état neuf", l);
        lex.add(e);

        e.addRayon(r);

        r = new Rayon("r45", "science fiction");
        lrayon.add(r);

        e = new Exemplaire("d12", "griffé", d);
        lex.add(e);

        e.addRayon(r);

        Lecteur lec = new Lecteur(1, "Dupont", "Jean", LocalDate.of(2000, 1, 4), "Mons", "jean.dupont@mail.com", "0458774411");
        llect.add(lec);

        Location loc = new Location(LocalDate.of(2023, 2, 1), LocalDate.of(2023, 3, 1), lec, e);
        lec.addLoc(loc, e);
        lloc.add(loc);

        lec = new Lecteur(1, "Durant", "Aline", LocalDate.of(1980, 10, 10), "Binche", "aline.durant@mail.com", "045874444");
        llect.add(lec);

        loc = new Location(LocalDate.of(2023, 2, 5), LocalDate.of(2023, 3, 5), lec, e);
        lec.addLoc(loc, e);
        lloc.add(loc);
    }

    public static void main(String[] args) {
        int choix;
        Scanner sc = new Scanner(System.in);
        populate();
        do {
            System.out.println("1.Auteur 2.Ouvrages 8.fin");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    addAuteur();
                    break;
                case 2:
                    gestOuvrage();
                    break;
            }
        } while (choix != 8);
    }

    public static Boolean verifierEntree(String entree, String regex) {
        return entree.matches(regex);
    }

    public static String verifEntreeBoucle(String regex, String msg, String erreur) {
        String s;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(msg);
            s = sc.nextLine();
            if (!verifierEntree(s, regex)) {
                System.out.println(erreur);
            }
        } while (!verifierEntree(s, regex));
        return s;
    }
    public static void listOuvr() {
        System.out.println("Choissisez votre Type d'ouvrage");
        System.out.println("-----------------------\n");
        System.out.println("1 - CD");
        System.out.println("2 - DVD");
        System.out.println("3 - LIVRE");
    }
}