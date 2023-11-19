public class TestVoiture {
    public static void main(String[] args)
    {
        Voiture v = new Voiture("Porsche",1000000);
        System.out.println(v.getMarque());
        System.out.println(v.getPrix());
        v.setMarque("lamborgini");
        System.out.println(v.getMarque());
        v.setPrix(1223223);
        System.out.println(v.getPrix());
        System.out.println("=========================");
        v.afficher();
        System.out.println(v.getMarque());
        System.out.println(v.getPrix());





    }
}
