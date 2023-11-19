/*
Quels résultats affiche-t-il lorsqu’on lui fournit en donnée :
1. la valeur 0,
2. la valeur 1,
3. la valeur 4,
4. la valeur 10,
5. la valeur -5.
 */
import java.util.Scanner;
public class Exercice8 {
    public static void main(String[] args)
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        switch (n)
        {
            case 0:
                System.out.println("Nul");
            case 1:

            case 2:
                System.out.println("Petit");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Moyen");
            default : System.out.println("Grand");

        }
        scanner.close();
    }
}
