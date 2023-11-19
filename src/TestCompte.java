public class TestCompte {
    public static void main(String[] args)
    {
        Compte c = new Compte(12);
        c.deposer(100);
        c.retirer(20);
        c.afficher();

    }

}
