/*
Ecrire un programme java qui permet d'échanger
les valeurs de deux nombres saisies par l'utilisateur.
 */
import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Veuillez saisir deux entiers");
        a = scanner.nextInt();
        b = scanner.nextInt();
        /* on commence par intervertir le contenu
        de nos deux variables
         */
        c = a;
        a=b;
        b = c;
        /* on affiche le resultat

         */
        System.out.println("a = "+a+" et b = "+b);
        scanner.close();

    }
}
