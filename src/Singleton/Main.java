package Singleton;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi"); // object creation

        // obtain Singleton instance
        CarManager manager = CarManager.getInstance();

        car.start();
        manager.serviceCar(car);
        car.stop();
    }
}