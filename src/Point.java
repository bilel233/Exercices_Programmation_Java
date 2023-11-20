public class Point {
    private char nom;
    private double abscisse;

    public Point(char nom,double abscisse)
    {
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public void affiche()
    {
        System.out.println("nom = "+this.nom+" abscisse = "+this.abscisse);

    }
    public void translate(double tr)
    {
        this.abscisse+=tr;
    }

}
