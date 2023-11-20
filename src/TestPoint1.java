public class TestPoint1 {
    public static void main(String[] args)
    {
        Point1 p = new Point1(10,10);
        Point1 d = new Point1(100000,100);
        p.affiche();
        d.affiche();

        Point1.MaxNorme(p,d);


    }
}
