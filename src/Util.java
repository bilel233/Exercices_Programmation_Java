import java.util.Scanner;

public class Util {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir deux entiers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Util.ackermann(a,b));

    }
    public static int ackermann(int m,int n)
    {
        if (m == 0 && n > 0)
        {
            return n + 1;
        }
        else if (m > 0 && n == 0)
        {
            return ackermann(m-1,1);
        }
        else {
            return ackermann(m-1,ackermann(m,n-1));
        }
    }
}

