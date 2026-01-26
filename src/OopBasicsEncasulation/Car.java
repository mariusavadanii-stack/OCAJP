package OopBasicsEncasulation;

public class Car {
    private String model;      // encapsulated
    private int doors;

    // protected → accesibil in subclase (ex: ElectricCar)
    protected boolean engineRunning;

    public Car(String model, int doors) {
        setModel(model);
        setDoors(doors);
        this.engineRunning = false;
    }

    public void startEngine() {
        engineRunning = true;
        System.out.println(model + " engine started!");
    }

    public void stopEngine() {
        engineRunning = false;
        System.out.println(model + " engine stopped.");
    }

    public void openTrunk() {
        System.out.println("Trunk opened for " + model);
    }

    // Encapsulation with controlled access:
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model name cannot be empty!");
        }
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if(doors <= 0) {
            throw new IllegalArgumentException("Car must have at least 1 door!");
        }
        this.doors = doors;
    }
}
