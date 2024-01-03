package Constructor;

public class Main {
    public static void main(String[] args)
    {
        Human human = new Human("Joe",22,50);
        Human human1 = new Human("Joeee",23,76);

        System.out.println(human.name);
        System.out.println(human1.name);

        human1.eat();
        human.drink();
    }



}
