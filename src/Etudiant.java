import java.util.Objects;

public abstract class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private float moyenne;

public Etudiant(){}

    public Etudiant(int id, String nom, String prenom, float moyenne) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Etudiant etudiant)) return false;
        return id == etudiant.id && Float.compare(moyenne, etudiant.moyenne) == 0 && Objects.equals(nom, etudiant.nom) && Objects.equals(prenom, etudiant.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, moyenne);
    }

    public abstract void AjouterUneAbsence();

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", moyenne=" + moyenne +
                '}';
    }
}
