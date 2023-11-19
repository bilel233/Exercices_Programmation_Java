/*Ecrire un programme Java qui
calcul la somme des 100 premiers entiers
 */

/* Ecrire un programme Java qui demande à l'utilisateur de saisir un nombre entier n et
lui affiche la somme des n premiers nombres entiers
 */
import java.util.Scanner;
public class Exercice6 {
    public static void main(String[] args)
    {
        Exercice6.somme100PremiersEntiers();
        System.out.println("===========================");
        Exercice6.afficheNNombresPremiers();

    }

    public static void somme100PremiersEntiers()
    {
        int s =0;
        for (int i=0;i<100;i++)
        {
            s = s+i;
            System.out.println(s);
        }
    }
    public static void afficheNNombresPremiers()
    {
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            s = s + i;
            System.out.println(s);
        }
        scanner.close();
    }

}
