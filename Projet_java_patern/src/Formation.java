import java.util.ArrayList;
import java.util.List;

public class Formation {
    private String nom;
    private List<Eleves> eleves;

    public Formation(String nom) {
        this.nom = nom;
        this.eleves = new ArrayList<>();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Eleves> getEleves() {
        return eleves;
    }

    public void setEleves(List<Eleves> eleves) {
        this.eleves = eleves;
    }
}