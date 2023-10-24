public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String mail;
    private int identifiant;
    private String motDePasse;

    public Personne(String nom, String prenom, int age, String mail, int identifiant, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.mail = mail;
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age + ", Mail: " + mail + ", Identifiant: " + identifiant;
    }
}