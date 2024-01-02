package Arrays;

public class Main {
    public static void main(String[] args)
    {
        String[] cars = {"Camaro","Corvette","Tesla","BMW"};
        cars[0] = "Mustang";

        System.out.println(cars[0]);
        String[] car = new String[3];
        car[0] = "camero";
        car[1] = "corvette";
        car[2] = "tesla";

        System.out.println(car[2]);

        for(int i=0;i< car.length;i++)
        {
            System.out.println(car[i]);
        }


    }
}
