public class Exercice13 {
    public static void main(String[] args)
    {
        int n,p;

        n= 0;
        while(n<=5)
        {
            n++;
            System.out.println("A : n = "+n);
        }
        System.out.println("=====================");

        n = p = 0;
        while(n<=8)
        {
            n+=p++;
            System.out.println("B : n = "+n);
        }
        System.out.println("=====================");

        n = p = 0;
        while(n<=8)
        {
            n+= ++p;
            System.out.println("C : n = "+n);
        }
        System.out.println("=====================");
        n = p = 0 ;
        while (p<=5){
            n += p++;
            System.out.println ("D : n = " + n) ;
        }

        System.out.println("=====================");

        n = p = 0 ;
        while (p<=5) {
            n+= ++p ;
            System.out.println ("D : n = " + n) ;
        }


    }
}
