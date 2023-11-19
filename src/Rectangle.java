public class Rectangle {
    private double longueur;
    private double largeur;

    public Rectangle (double longueur,double largeur)
    {
        this.longueur=longueur;
        this.largeur=largeur;
    }
    public double surface()
    {
        return longueur*largeur;
    }
    public double perimetre()
    {
        return 2*(longueur+largeur);
    }
    public void afficher()
    {
        System.out.println("surface = "+this.surface()+" perimetre = "+this.perimetre());

    }


}
