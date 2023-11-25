public class Bouteille {

    private double volume;

    public Bouteille(double volume)
    {
        this.volume = volume;
    }
    public Bouteille()
    {
        this(1.5);
    }
    public void remplir(Bouteille b)
    {
        this.volume = this.volume + b.volume;
    }
    public void remplir(double volume)
    {
        this.volume = this.volume+volume;
    }
    public String toString(){
        return "Volume du liquide dans la bouteille "+volume;
    }
}

// On a 2 constructeurs dans la classe Bouteille
//L'un est un constructeur par default ; l'autre prend un double


