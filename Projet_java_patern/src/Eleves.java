import java.util.List;

public class Eleves extends Personne {
    private Formation formation;
    private List<Notes> notes;
    private List<Plannings> plannings;

    public Eleves(String nom, String prenom, int age, String mail, int identifiant, String motDePasse, Formation formation, List<Notes> notes, List<Plannings> plannings) {
        super(nom, prenom, age, mail, identifiant, motDePasse);
        this.formation = formation;
        this.notes = notes;
        this.plannings = plannings;
    }

    public Eleves(String nom, String prenom, int age, String mail, int identifiant, String motDePasse) {
        super(nom, prenom, age, mail, identifiant, motDePasse);
    }

    public Eleves(Personne personne) {
        super(personne.getNom(), personne.getPrenom(), personne.getAge(), personne.getMail(), personne.getIdentifiant(), personne.getMotDePasse());
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    public List<Plannings> getPlannings() {
        return plannings;
    }

    public void setPlannings(List<Plannings> plannings) {
        this.plannings = plannings;
    }
}
