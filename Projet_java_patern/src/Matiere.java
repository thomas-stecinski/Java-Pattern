public class Matiere {
    private String nom;
    private Professeur professeur;
//Constructeur
    public Matiere(String nom, Professeur professeur) {
        this.nom = nom;
        this.professeur = professeur;
    }
//Getter
    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }
//Setter

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}