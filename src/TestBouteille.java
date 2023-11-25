public class TestBouteille {
    public static void main(String[] args)
    {
        Bouteille b = new Bouteille(10);

        Bouteille b1 = new Bouteille();

        System.out.println(b1.toString());
        System.out.println(b.toString());

        b.remplir(b1);

        System.out.println(b1.toString());
        System.out.println(b.toString());



    }

}
// this(1.5) ; on fait appel au constructeur Bouteille(1.5)