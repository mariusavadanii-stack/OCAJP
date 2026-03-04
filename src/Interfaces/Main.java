package Interfaces;

public class Main {
    public static void main(String[] args) {

        Vehicle myCar = new Car();

        myCar.start();
        myCar.honk();
        myCar.stop();

        System.out.println("Wheels: " + Vehicle.getDefaultWheels());
    }
}