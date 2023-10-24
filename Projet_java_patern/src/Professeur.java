public class Professeur extends Personne{
    public Professeur(Personne personne) {
        super(personne.getNom(), personne.getPrenom(), personne.getAge(), personne.getMail(), personne.getIdentifiant(), personne.getMotDePasse());
    }
}