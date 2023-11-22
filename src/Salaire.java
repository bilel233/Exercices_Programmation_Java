public class Salaire extends Personne{
    private double salaire;

    public Salaire(String nom,double salaire)
    {
        super(nom);
        this.salaire=salaire;
    }
    public double prime()
    {
        return (0.05*salaire)*nbEnfants;
    }
}
