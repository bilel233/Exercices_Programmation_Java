/* Ecrire un programme java qui demande à l'utilisateur de saisir son nom et
de lui afficher son nom avec le message de bienvenue
 */

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom");
        String nom = scanner.nextLine();
        System.out.println("votre nom est "+nom);
        scanner.close();
    }
}
