package ObjectArrays;

public class Main {
    public static void main(String[] args)
    {
        int[] numbers = new int[3];

        Food[] refregiretor = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");



        refregiretor[0]=food1;
        refregiretor[1] = food2;
        System.out.println(refregiretor[0]);
        System.out.println(refregiretor[0].name);
    }
}
