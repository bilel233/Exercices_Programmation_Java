/* Ecrire un programme java qui demande à l’utilisateur de
 saisir un nombre et de lui afficher son double

 */
import java.util.Scanner;
public class Exercice2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre");
        double nb = sc.nextDouble();
        double res = 2*nb;
        System.out.println("Le nombre saisit est "+res);
        sc.close();
    }

}
