public class Pion {
    private String nom;
    private double posx;

    public Pion(String n)
    {
        nom = n;
        posx=Math.random();
    }
    public void setNom(String n)
    {
        nom = n;
    }
    public String getNom()
    {
        return nom;
    }
}
