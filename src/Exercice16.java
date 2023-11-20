import java.util.Scanner;
public class Exercice16 {
    public static void main(String[] args)
    {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int n = scanner.nextInt();
        int[] tab = new int[n];
        for(int i=0;i<tab.length;i++)
        {
            tab[i] = (2*i+1)*(2*i+1);

        }
        for(int i=0;i<tab.length;i++)
        {
            System.out.println(tab[i]+" a pour valeur");
        }
    }
}
