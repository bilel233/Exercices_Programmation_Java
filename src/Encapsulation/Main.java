package Encapsulation;

public class Main {
    public static void main(String[] args)
    {
        Car car = new Car("Chevrolet","Camero",2024);

       System.out.println(car.getMake());

       car.setMake("Porsche");

       System.out.println(car.getMake());

    }
}
