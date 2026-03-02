package TypesOfClassesSuplimentar;

public class Main {
    public static void main(String[] args) {

        // Vehicul concret (cu VIN)
        Sedan sedan = new Sedan("VIN-999-ABC", "Audi", "A4", 450);
        Sedan sedan2 = new Sedan("VIN-888-DEF", "Audi", "A6", 550);
        System.out.println("Descriere: " + sedan.getDescription());

        // Singleton Registry
        VehicleRegistry registry = VehicleRegistry.getInstance();
        registry.registerVehicle(sedan.getVin());  //  method exists and received String
        registry.registerVehicle(sedan.getVin());  // test: already recorded
        registry.registerVehicle(sedan2.getVin());  // test: already recorded
        registry.registerVehicle(sedan2.getVin());  // test: already recorded

        // Logging explicit
        VehicleLogger.get().info("Done.");
    }
}