import java.util.Scanner;
public class Exercice17 {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        double[] tab = new double[5];
        for(int i=0;i<tab.length;i++)
        {
            System.out.println("Saisir un nombre");
            tab[i] = scanner.nextDouble();
            System.out.println("val = "+tab[i]);


        }
        double max = tab[0];
        double moy = 0.;
        double min = tab[0];
        double s = 0.;
        for(int i=0;i<tab.length;i++)
        {

            if (max <= tab[i]){
                max = tab[i];
            }
            if(min >= tab[i])
            {
                min = tab[i];
            }
            s = s + i;


        }
        moy = (float)s / tab.length;
        System.out.println(min+" "+max+" "+" "+moy);
        scanner.close();
    }
}
