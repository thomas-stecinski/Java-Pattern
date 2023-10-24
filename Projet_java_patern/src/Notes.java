public class Notes {
    private float coef;
    private float valeur;
    private Matiere matiere;
    //Constructeur
    public Notes(float coef, float valeur, Matiere matiere) {
        this.coef = coef;
        this.valeur = valeur;
        this.matiere = matiere;
    }

//Getter

    public float getCoef() {
        return coef;
    }

    public float getValeur() {
        return valeur;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

//Setter
}