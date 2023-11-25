public class Orchestre extends Instrument {
    
    private Instrument[] tab;
    private int nbMaxInstruments;
    
    private int nbInstrumentCourant;

    public Orchestre(double poids,double prix,int nbMaxInstruments)
    {
        super(poids,prix);
        this.tab = new Instrument[nbMaxInstruments];
    }
    
    public void ajouterInstrument(Instrument i)
    {
        if (nbMaxInstruments < nbInstrumentCourant)
        {
            for (int j=0;j< tab.length;j++)
            {
                if(tab[j] == null)
                {
                  tab[j] = i ;
                }
            }
        }
    }
    public String jouer()
    {
        return this.jouer()+" "+this.jouer();
    }
}
