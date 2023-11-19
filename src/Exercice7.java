/*

Ecrire un programme Java qui demande à l'utilisateur de saisir son âge et de lui afficher qu'il est mineur si son âge est inférieur à
18 ans et qu'il est majeur dans le cas contraire ?
 */
import java.util.Scanner;
public class Exercice7 {
    public static void main(String[] args)
    {
        /* appel de la fonction age

         */
        Exercice7.age();
    }
    public static void age()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre age");
        int age = scanner.nextInt();
        if (age<18)
        {
            System.out.println("Vous etes mineur");
        }
        else
        {
            System.out.println("Vous etes majeur");
        }
        scanner.close();
    }
}
