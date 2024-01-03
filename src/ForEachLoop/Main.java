package ForEachLoop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        String[] animals = {"cat","dog","rat"};
        ArrayList<String> animal = new ArrayList<String>();

        animal.add("cat");
        animal.add("dog");
        animal.add("rat");

        for(String i : animals){
            System.out.println(i);
        }

        for(String i : animal)
        {
            System.out.println(i);
        }
    }
}
