public class Campus {
    private int NumeroRue;
    private String Rue;
    private String Ville;
    private Salles salles;

    public Campus(int numeroRue, String rue, String ville, Salles salles) {
        NumeroRue = numeroRue;
        Rue = rue;
        Ville = ville;
        this.salles = salles;
    }

    public int getNumeroRue() {
        return NumeroRue;
    }

    public void setNumeroRue(int numeroRue) {
        NumeroRue = numeroRue;
    }

    public String getRue() {
        return Rue;
    }

    public void setRue(String rue) {
        Rue = rue;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public Salles getSalles() {
        return salles;
    }

    public void setSalles(Salles salles) {
        this.salles = salles;
    }
}