
public class Compte {
    private double solde;

    public Compte(double solde)
    {
        this.solde = solde;
    }
    public void deposer(double argent)
    {
        this.solde = this.solde + argent;
    }
    public void retirer(double argent)
    {
        this.solde = this.solde - argent;
    }
    public void afficher()
    {
        System.out.println("le solde est "+this.solde);
    }
    public double getSolde()
    {
        return solde;
    }

}
