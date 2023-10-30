public class EtudiantAlternance extends Etudiant{
    private int salaire;

    public EtudiantAlternance(int id, String nom, String prenom, float moyenne, int salaire) {
        super(id, nom, prenom, moyenne);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void AjouterUneAbsence(){
        setSalaire(getSalaire()-50);
    }

    @Override
    public String toString() {
        return "EtudiantAlternance{" +
                "salaire=" + salaire +
                '}';
    }
}
