import java.util.Scanner;
public class Exercice11 {
    public static void main(String[] args)
    {
        int i = 0;
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int n = scanner.nextInt();
        while (i < n )
        {
            s = s + i;
            i++;
            System.out.println("la somme vaut "+s);
        }
        scanner.close();
    }
}
