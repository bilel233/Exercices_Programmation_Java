/*Ecrire un programme java qui demande à l’utilisateur de saisir un nombre entier et de lui afficher que
 le nombre est pair ou impair selon la valeur tapée
 */
import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int n = scanner.nextInt();
        if(n%2==0)      /* on verifie si n est pair
        */
        {
            System.out.println("le nombre saisit est pair "+n);
        }
        else {
            System.out.println("le nombre saisit est impair "+n);
        }
        scanner.close();
    }
}

