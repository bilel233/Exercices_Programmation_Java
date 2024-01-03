package SwapVariables;

public class Main {
    public static void main(String[] args)
    {
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x;
        x=y;
        y = temp;

        System.out.println(x);
        System.out.println(y);

       // y = x;
        System.out.println("\n");

        System.out.println(x);
        System.out.println(y);


    }
}
