public class Personne {
    protected String nom;
    protected String prenom;

    protected String nuTel;
    protected int nbEnfants;

    public Personne(String n,String p,String t)
    {
        nom = n;
        prenom=p;
        nuTel=t;
        nbEnfants=0;
    }
    public Personne(String n)
    {
        nom=n;
    }
    public String getNom()
    {
        return nom;
    }
    public void ajouterEnfant()
    {
        nbEnfants++;
    }

}
