public class Point1 {
    private double x;
    private double y;
    public Point1(int abs,int ord)
    {
        x = abs;
        y = ord;
    }
    public void affiche()
    {
        System.out.println("Coordonnes :"+x+" "+y);
    }
        public static Point1 MaxNorme(Point1 a,Point1 b)
        {
            double na = a.x*a.x + a.y*a.y;
            double nb = b.x*b.x + b.y*b.y;
            if(na> nb)
            {
                return a;
            }
            return b;
        }
}
