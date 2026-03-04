package Singleton;

public class Car {

    private String model; //accessible only from inside class

    public Car(String model) {  //constructor
        this.model = model;
    }

    public void start() {
        System.out.println(model + " started.");
    }

    public void stop() {
        System.out.println(model + " stopped.");
    }
}
