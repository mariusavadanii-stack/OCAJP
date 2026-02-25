package TypesOfClasses;

// Public class Driver: this is a concrete class that represents a car driver.
// It demonstrates how an external object can interact with BaseCar objects
// using shared behaviors defined in the abstract parent class.
public class Driver {

    // Method drive(): simulates the action of a driver operating a car.
    // It accepts any subclass of BaseCar thanks to polymorphism.
    public void drive(BaseCar car) {
        System.out.println("Driver starts driving...");

        // Calls the shared behavior defined in BaseCar.
        // Every specific car type (Sedan, SUV, anonymous class) will reuse this behavior.
        car.start();
    }
}