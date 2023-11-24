public class Reine extends Fourmi{
    private int cpt;
    public Reine(String nom)
    {
        super(nom);
        cpt = 0;

    }
    public Fourmi engendrer()
    {
        cpt++;
        return new Ouvriere(nom+cpt);
    }
    public void manger(GeleeRoyale g)
    {
        System.out.println(nom+" "+"(Reine) +mange de"+g);
    }
}
