package Interface;

public class Fish implements Prey,Predator{

    @Override
    public void hunt() {
        System.out.println("this fish is hunting smaller fish");
    }

    @Override
    public void flee() {

        System.out.println("this fish is hunting from a larger fish");

    }
}
