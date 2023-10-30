public class Etudiant3eme extends Etudiant{
    private String branche;
    Etudiant etudiant;

    public Etudiant3eme(String branche) {
        this.branche = branche;
    }

    public Etudiant3eme(int id, String nom, String prenom, float moyenne, String branche) {
        super(id, nom, prenom, moyenne);
        this.branche = branche;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public void AjouterUneAbsence()
    {
        setMoyenne(getMoyenne()-0.5f);
    }
}
