package TypesOfClassesSuplimentar;


public class Vehicle {
    private final String vin;

    public Vehicle(String vin) {
        this.vin = vin;
        VehicleLogger.logVehicleCreated("Vehicle VIN = " + vin);
    }

    public String getVin() {
        return vin;
    }
}
