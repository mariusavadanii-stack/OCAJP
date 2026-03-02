package TypesOfClassesSuplimentar;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


        // helper class for logging based on java.util.logging
public final class VehicleLogger {
    private static final Logger logger = Logger.getLogger("TypesOfClassesSupplementary");

    static {
        //disable ParentHandlers
        logger.setUseParentHandlers(false);
        // Config : adds ConsoleHandler with SimpleFormater
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
    }

    private VehicleLogger() {}

            //get() - access to Logger
    public static Logger get() {
        return logger;
    }
            // method for logging creation of a vehicle
    public static void logVehicleCreated(String vehicleName) {
        logger.log(Level.INFO, "Vehicle created: {0}", vehicleName);
    }
}