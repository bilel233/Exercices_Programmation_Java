public class TestTruc {
    public static void main(String[] args)
    {
        Truc n1 = new Truc();
        System.out.println(n1.getCpt());
        Truc n2 = new Truc(25);
        System.out.println(n1.getCpt()+" "+n2.getCpt());
        Truc n3 = new Truc();
        System.out.println(n1.getNum()+" "+n2.getNum()+" "+n3.getNum());
        System.out.println(n1.getCpt()+" "+n2.getCpt()+" "+n3.getCpt());
        Truc n4 = new Truc();
        System.out.println(n4.getCpt());
        System.out.println(Truc.getCpt());

    }
}
/* pour num, il s'agit d'une variable d'instance. donc
impossible de l'instancier par la classe
 */