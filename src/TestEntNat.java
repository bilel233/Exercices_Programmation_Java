public class TestEntNat {
    public static void main(String[] args)
    {
        try
        {
            EntNat N = new EntNat(10);
            System.out.println(N.getN());
            EntNat n2 = new EntNat(-10);


        }
        catch (ErrConst e)
        {
            System.out.println("*** erreur de construction ***");

        }
    }
}
