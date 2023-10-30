import java.util.Arrays;

public class Ecole extends Etudiant {
    private String nom;
    private Etudiant[] tabEtudiant=new Etudiant[500];
    private Etudiant3eme[] tabetudiant3eme=new Etudiant3eme[500];
    private EtudiantAlternance[] tabEtudiantAlternances=new EtudiantAlternance[500];
    Etudiant etudiant;
    Etudiant3eme etudiant3eme;
    EtudiantAlternance etudiantAlternance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void AjouterUneAbsence() {

    }


    public Ecole(String nom) {
        Etudiant tabEtudiant[]=new Etudiant[500];
        this.nom = nom;
    }

    public int rechercher_Etudiant (Etudiant e)
    {
        int i;
        for (i=0;i<tabEtudiant.length;i++)
        {
            if (tabEtudiant[i] == e)
            {
                return i;
            }

        }
        return -1;
    }

    public boolean ajouterEtudiant()
    {
        int i;
        for (i=0;i<tabEtudiant.length;i++)
        {
            if (rechercher_Etudiant(etudiant)!=-1)
            {return false;}
            else
            tabEtudiant[i]=etudiant;
        }
        return true;
    }

    public float getMoyenneDes3A()
    {
        int i=0;
        float MOY=0;
        for (i=0;i< tabetudiant3eme.length;i++)
        {
            MOY=MOY+tabetudiant3eme[i].getMoyenne();
        }
        return MOY;
    }

    public int moyenneSalaireAlternant()
    {
        int i;
        int salaire=0;
        for (i=0;i< tabEtudiantAlternances.length;i++)
        {
            salaire=salaire+tabEtudiantAlternances[i].getSalaire();
        }
        return salaire;
    }

    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", tabEtudiant=" + Arrays.toString(tabEtudiant) +
                ", tabetudiant3eme=" + Arrays.toString(tabetudiant3eme) +
                ", tabEtudiantAlternances=" + Arrays.toString(tabEtudiantAlternances) +
                ", etudiant=" + etudiant +
                ", etudiant3eme=" + etudiant3eme +
                ", etudiantAlternance=" + etudiantAlternance +
                '}';
    }

    public boolean changerEcole(Etudiant etd,Ecole E)
    {
        return true;
    }
}
