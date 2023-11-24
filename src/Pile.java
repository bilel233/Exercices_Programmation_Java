public class Pile {
    private int tailleMaximalePile;
   public static Machin[] tab;


    public Pile(int tailleMaximalePile)
    {
       Machin[] tab = new Machin[tailleMaximalePile];
    }

    public void empiler (Machin m)
    {
        Pile.tab[0] = m;

    }
    public Machin depiler()
    {
        return Pile.tab[0];
    }


}
