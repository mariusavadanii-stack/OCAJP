package TypesOfClasses;

// Demo class: contains the main method and showcases all concepts:
// - static nested classes
// - inner classes
// - abstract classes and concrete subclasses
// - shared behavior from BaseCar
// - subclass-specific behavior
// - anonymous class usage
// - polymorphism through the Driver class
public class Demo {

    // Main method: program entry point
    public static void main(String[] args) {

        // === Driver instance ===
        // Creates a new Driver object, which can interact with any BaseCar subclass.
        Driver driver = new Driver();

        // === Static Nested Class (Brand) ===
        // Static nested classes do NOT require an instance of the outer class.
        // We can access Brand directly through Car.Brand.
        Car.Brand brand = new Car.Brand("Mercedes", "Germany");
        brand.printBrand();  // Demonstrates behavior of the Brand class

        // === Inner Class (Engine) ===
        // An inner class MUST be created through an instance of the outer class.
        // Below, Car() is created inline, and we immediately create an Engine from it.
        Car mycar = new Car();
        Car.Engine engine = mycar.new Engine("V8", 530);

//        Car.Engine engine = new Car().new Engine("V8", 530);
        engine.printEngine();  // Demonstrates behavior of the Engine class

        // === Abstract Class Demo ===
        // BaseCar cannot be instantiated directly, so we use subclasses.
        BaseCar sedan = new Sedan();
        BaseCar suv = new SUV();

        // Initialize shared fields using setter methods defined in BaseCar
        sedan.setName("Mercedes S-Class");
        sedan.setDeliveryAvailable(true);

        suv.setName("Mercedes G-Class");
        suv.setDeliveryAvailable(false);

        // === Specific behaviors of subclasses ===
        // Sedan-specific feature
        ((Sedan) sedan).luxuryFeature();

        // SUV-specific feature
        ((SUV) suv).offRoadMode();

        // === Driver interacting with cars ===
        System.out.println("\n--- Driver Demo ---");
        driver.drive(sedan);   // Uses BaseCar.start() via polymorphism
        sedan.deliver();       // Shared method from BaseCar

        driver.drive(suv);     // Again uses start()
        suv.deliver();         // Different output because deliveryAvailable is false

        // === Anonymous Class Demo ===
        // Creates an unnamed subclass of BaseCar with custom behavior.
        BaseCar experimentalCar = new BaseCar() {
            @Override
            public boolean isAvailableInStock() {
                return false;  // Unique behavior for this anonymous instance
            }

            // Anonymous-specific method (not accessible outside unless cast)
            public void showPrototypeMessage() {
                System.out.println("Prototype vehicle: not in stock, experimental only.");
            }
        };

        System.out.println("\n--- Anonymous Class Demo ---");
        experimentalCar.setName("Experimental Prototype");
        experimentalCar.setDeliveryAvailable(false);
        experimentalCar.start();
        experimentalCar.deliver();
        // experimentalCar.showPrototypeMessage();  // Not accessible directly unless cast
    }
}