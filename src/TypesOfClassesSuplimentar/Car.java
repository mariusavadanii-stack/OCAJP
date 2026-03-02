package TypesOfClassesSuplimentar;


public class Car extends Vehicle {
    private final String brand;
    private final String model;

    public Car(String vin, String brand, String model) {
        super(vin);
        this.brand = brand;
        this.model = model;
        VehicleLogger.get().info("Car created: " + brand + " " + model + " (VIN: " + getVin() + ")");
    }

    public String getDescription() {
        return brand + " " + model;
    }
}