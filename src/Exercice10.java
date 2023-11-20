public class Exercice10 {
    public static void main(String[] args)
    {
        // groupe 1

        int a = 1;
        int b = 2;
        int max = 0;
        if(a < b){
            System.out.println("ascendant"); // rajouter le ;
        }
        else{
            System.out.println("non ascendant");
        }
        // groupe 2
        if (a<b)
        {
            System.out.println("ascendant");
            max=b; // rajouter le ;
        }

        // groupe 3

        int n,p;
        n = 3;


        switch(n)
        {
            case 2:
                System.out.println("petit");
                break;
            case 5: // valeur constante est requise
                System.out.println("limite");
                break;
        }

        // groupe 4

        int c ;
        final int LIMITE = 20;

        c = 3;

        switch(c)
        {
            case LIMITE -1: System.out.println("un peu petit");
            break;
            case LIMITE: System.out.println("OK");
            break;
            case LIMITE+1: System.out.println("un peu grand");
            break;

        }




    }
}
