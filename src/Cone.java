public class Cone {
    private double r;
    private double h;

    private final double PI = 3.14159;
    private static int nbCones;

    public Cone(double r,double h)
    {
        this.r = r;
        this.h = h;
    }
    public Cone()
    {
        this.r = Math.random()*(10-0+1);
        this.h = Math.random()*(10-0+1);

    }
    public static void setNbCones(int nbCones)
    {
        Cone.nbCones=nbCones;
    }
    public double getVolume()
    {
        return 3*PI*r*r*h/(3);
    }

    public String toString()
    {
        return "Cone = "+r+"h = "+h+" et V = "+this.getVolume();
    }

}
