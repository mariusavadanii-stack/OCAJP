package OopAbstraction;


// Abstract class
abstract class Vehicle {
    // Abstract method (no implementation)
    abstract void move();    //use it like general rule.

    // Concrete method
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

// Car class extends Vehicle
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives on the road.");
    }
}

// Plane class extends Vehicle
class Plane extends Vehicle {
    @Override
    void move() {
        System.out.println("The plane flies in the sky.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();       //Polimorphism
        Vehicle plane = new Plane();

//        Vehicle vehicle = new Vehicle();

        car.move();
        car.stop();

        plane.move();
        plane.stop();
    }
}
