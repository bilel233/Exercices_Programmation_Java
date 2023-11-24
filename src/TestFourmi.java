public class TestFourmi {
    public static void main(String[] args)
    {
        Fourmi f1 = new Fourmi("f1");
        Fourmi f2 = new Ouvriere("ouv1");
        Ouvriere f3 = new Ouvriere("ouv2");
        Fourmi f4 = new Reine("majeste1");
        //Ouvriere f5 = new Reine("majeste2");
        Reine f6 = new Reine("majeste3");
        Fourmi[] fourmiliere = new Fourmi[100];
      //  f2.manger(new Nourriture("sucre"));
       // fourmiliere[0] = f4.engendrer();
        fourmiliere[2] = f6.engendrer();
       // fourmiliere[3] = ((Reine) f2).engendrer();
        fourmiliere[4] = ((Reine) f4).engendrer();
        fourmiliere[5] = ((Reine) f6).engendrer();

        Reine r1 = new Reine("majeste1");
        Fourmi r2 = new Reine("majeste2");
        r1.manger(new Nourriture(" un peu de sucre"));
        r1.manger(new GeleeRoyale());
        r2.manger(new Nourriture("un peu de viande"));
        r2.manger(new GeleeRoyale());

    }
}
