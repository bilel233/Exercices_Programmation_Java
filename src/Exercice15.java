import java.util.Scanner;
public class Exercice15 {
    public static void main(String[] args){
        System.out.println(Exercice15.sommeHarmonique());
    }

    public static double sommeHarmonique()
    {
        /* renvoie la somme des n premiers termes d'une suite harmonique

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un entier");
        int n = scanner.nextInt();
        double s = 0.;
        for(int i=1;i<=n;i++)
        {
            s = s + (float)1 / i;
        }
        return s;


    }

}
