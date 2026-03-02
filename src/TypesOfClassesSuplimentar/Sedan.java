package TypesOfClassesSuplimentar;

public class Sedan extends Car {
    private final int trunkSize;

        //this constructor calls Vin from Vehicle + brand & model from Car
    public Sedan(String vin, String brand, String model, int trunkSize) {
        super(vin, brand, model);
        this.trunkSize = trunkSize;
    }
        //uses Car.getDescription + adds Sedan details
    @Override
    public String getDescription() {
        return super.getDescription() + " (Sedan, trunk: " + trunkSize + "L)"; //this is printed in stout not in logging
    }
}
