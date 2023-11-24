public class TestAttrapePas0 {
    public static void main(String[] args)
    {
        try {
            int[] tab = {1, 2, 3, 4, 5};
            for (int i = 0; i < 15; i++) {
                System.out.println(tab[i] + " ");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception : depassement des bornes a la position 5");
            System.out.println(e.getMessage());
        }
    }
}
