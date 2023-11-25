public class TestOrchestre {

    public static void main(String[] args)
    {
        Guitare g = new Guitare(100,10);
        Piano p = new Piano(1000,10);
        Trompette t = new Trompette(1,20);

        Instrument i = new Instrument(10,10);
         System.out.println(g.jouer());

    }
}
