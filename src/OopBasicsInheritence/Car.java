package OopBasicsInheritence;

// Car.java
public class Car {
    private String model;      //private -> can not be accessed directly outside the class
    private int doors;

    public Car(String model, int doors) {   // class constructor
        this.model = model;
        this.doors = doors;
    }

    public void startEngine() {
        System.out.println(model + " engine started!");
    }

    public void openTrunk() {
        System.out.println("Trunk opened for " + model);
    }

    public String getModel() {
        return model;
    }
}
