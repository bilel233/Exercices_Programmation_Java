public class Voiture {
    private String marque;
    private double prix;

    public Voiture(String marque,double prix)
    {
        this.marque=marque;
        this.prix=prix;
    }
    public String getMarque()
    {
        return marque;
    }
    public void setMarque(String marque)
    {
        this.marque=marque;
    }
    public double getPrix()
    {
        return prix;

    }
    public void setPrix(double prix)
    {
        this.prix=prix;
    }
    public void afficher()
    {
        System.out.println(this.getMarque());
        System.out.println(this.getPrix());
        this.setPrix(30);
        this.setMarque("Nique");

    }
}
