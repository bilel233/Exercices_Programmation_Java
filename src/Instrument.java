public class Instrument{
    protected double poids;
    protected double prix;

    public Instrument(double poids,double prix)
    {
        this.poids=poids;
        this.prix=prix;


    }
    public String toString()
    {
        return "poids ="+poids+" et prix = "+prix;
    }



}
