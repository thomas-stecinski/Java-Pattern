public class Salles {
    private String batimentLettre;
    private String numeroSalle;

    public Salles(String batimentLettre, String numeroSalle) {
        this.batimentLettre = batimentLettre;
        this.numeroSalle = numeroSalle;
    }

    public String getBatimentLettre() {
        return batimentLettre;
    }

    public void setBatimentLettre(String batimentLettre) {
        this.batimentLettre = batimentLettre;
    }

    public String getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(String numeroSalle) {
        this.numeroSalle = numeroSalle;
    }
}
