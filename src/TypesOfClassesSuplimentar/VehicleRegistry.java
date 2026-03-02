package TypesOfClassesSuplimentar;

import java.util.Set;
import java.util.HashSet;

    // Singleton class
    //Set is a collection that cannot contain duplicate elements (interface not a class has implementation as various classes HashSet, LinkedHashSet)

public final class VehicleRegistry {
    private static volatile VehicleRegistry instance;
    //declareates of the HashSet named registeredVins
    private final Set<String> registeredVins = new HashSet<>();

    //private constructor
    // at the first call VehicleRegistry is null
    private VehicleRegistry() {}

    // pattern for double-checked locking Singleton it returns a single shared instance
    public static VehicleRegistry getInstance() {
        // check without locking if instance is created, if not created -> continue
        if (instance == null) {
            //double check and creates a unique instance
            //Locks on the class object to ensure only one thread creates the instance.
            //Needed because multiple threads may pass the first check simultaneously.
            synchronized (VehicleRegistry.class) {
                if (instance == null) {
                    //Creates the Singleton instance only once per app
                    instance = new VehicleRegistry();
                }
            }
        }
        return instance;
    }


    public void registerVehicle(String vin) {
        if (registeredVins.add(vin)) {
            VehicleLogger.get().info("Vehicle with VIN " + vin + " registered.");
        } else {
            VehicleLogger.get().info("Vehicle with VIN " + vin + " already registered.");
        }
    }
    //Checks whether a VIN is already in the set.
    public boolean isRegistered(String vin) {
        return registeredVins.contains(vin);
    }
}