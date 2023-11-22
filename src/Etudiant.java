public class Etudiant extends Personne {
    private String cursus;
    public Etudiant(String n,String p,String t,String c)
    {
        super(n,p,t);
        cursus=c;
    }
    public boolean estEnL2()
    {
        return cursus.equals("L2");
    }
}
