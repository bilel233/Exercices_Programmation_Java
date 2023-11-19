
/*Ecrire un programme java qui demande à l’utilisateur de saisir successivement deux nombres réels et
 de lui afficher le maximum des deux
 */
import java.util.Scanner;
public class Exercice3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir deux nombres reels");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a > b)
        {
            System.out.println("le maximum est "+a);

        }
        else if (a < b)
        {
            System.out.println("le maximum est "+b);
        }
        else {
            // a et b sont identiques
            System.out.println("le maximum est "+a);
        }
        scanner.close();
    }
}
