public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne("frederico", "toma", 54, "frederico@gmail.com", 1, "1234a");
        Personne personne2 = new Personne("laporte", "valentin", 13, "valentin@gmail.com", 10, "1234b");

        Eleves eleve1 = new Eleves(personne1);
        Professeur professeur1 = new Professeur(personne2);

        System.out.println(eleve1.toString());
        System.out.println(professeur1.toString());
    }
}