package Interface;

public class Main {
    public static void main(String[] args)
    {
        Rabit rabit = new Rabit();
        rabit.flee();

        Hawk hawk = new Hawk();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
