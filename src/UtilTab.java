public class UtilTab {

    public static void main(String[] args)
    {
        double[] tab = new double[10];
        System.out.println(UtilTab.somme(tab));
        UtilTab.incremente(tab);
    }
    public static double somme(double[] tab)
    {
        double s=0.;
        for(int i=0;i<tab.length;i++)
        {
            s+=i;

        }
        return s;

    }
    public static void incremente(double[] tab)
    {
        for(int i=0;i<tab.length;i++)
        {
            tab[i]= tab[i]+1;
            System.out.println(tab[i]);
        }
    }
}
