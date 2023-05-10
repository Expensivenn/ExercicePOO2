package bibliotheque.metier;

import java.io.FileWriter;
import java.io.IOException;

public class Mail {
    private String destinataire;
    private String objet;
    private String message;
    private String dateEnvoi;

    public Mail(String destinataire, String objet, String message, String dateEnvoi) {
        this.destinataire = destinataire;
        this.objet = objet;
        this.message = message;
        this.dateEnvoi = dateEnvoi;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(String dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public void envoi() {
        String nomFichier = this.destinataire + ".txt";
        try (FileWriter writer = new FileWriter(nomFichier)) {
            writer.write("Objet : " + this.objet + "\n\n");
            writer.write(this.message);
        } catch (IOException e) {
            System.out.println("Une erreur est survenue lors de la création du fichier.");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Mail{" +
                "destinataire='" + destinataire + '\'' +
                ", objet='" + objet + '\'' +
                ", message='" + message + '\'' +
                ", dateEnvoi='" + dateEnvoi + '\'' +
                '}';
    }
}
