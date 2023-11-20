import java.util.Scanner;

public class Exercice14 {

    public static void main(String[] args) {
        Exercice14.racineCarre();
    }
    public static void racineCarre(){
        Scanner scanner = new Scanner(System.in);
        double x;
        do {
            System.out.println("donnez un nombre positif");
            x = scanner.nextDouble();
            if (x < 0) {
                System.out.println("svp positif");
            }
            if (x <= 0) {
                continue;


            }
            System.out.println("sa racine carree est " + Math.sqrt(x));

        }while(x!=0);
        scanner.close();

        }
    }

