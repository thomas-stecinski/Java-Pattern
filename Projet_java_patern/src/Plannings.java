public class Plannings {
    private int minutes;
    private int heures;
    private int jours;
    private int mois;
    private int annees;
    private Matiere matiere;
    private Professeur professeur;
    private Campus campus;

    public Plannings(int minutes, int heures, int jours, int mois, int annees, Matiere matiere, Professeur professeur, Campus campus) {
        this.minutes = minutes;
        this.heures = heures;
        this.jours = jours;
        this.mois = mois;
        this.annees = annees;
        this.matiere = matiere;
        this.professeur = professeur;
        this.campus = campus;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getJours() {
        return jours;
    }

    public void setJours(int jours) {
        this.jours = jours;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public int getAnnees() {
        return annees;
    }

    public void setAnnees(int annees) {
        this.annees = annees;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
}