package TypesOfClasses;

// Public class Car: this is the outer class that contains nested classes.
// It groups related types (Brand and Engine) that conceptually belong to a Car.
public class Car {

    // ==== Static Nested Class ====

    // Static nested class Brand: can be accessed without creating a Car object.
    // It behaves like a top-level class but is namespaced inside Car for clarity.
    public static class Brand {
        // Private field that stores the brand name
        private String name;
        // Private field that stores the country of origin
        private String country;

        // Constructor for Brand: initializes name and country
        public Brand(String name, String country) {
            // Assigns the parameter value to the field "name"
            this.name = name;
            // Assigns the parameter value to the field "country"
            this.country = country;
        }

        // Utility/behavior method: prints a human-readable representation of the brand
        public void printBrand() {
            System.out.println("Brand: " + name + " (" + country + ")");
        }
    }

    // ==== Inner Class ====

    // Inner (non-static) class Engine: requires an instance of Car to be created.
    // It holds data that is conceptually tied to a particular Car instance.
    public class Engine {
        // Private field that stores the engine type (e.g., "V8", "Diesel")
        private String type;
        // Private field that stores the engine horsepower
        private int horsepower;

        // Constructor for Engine: initializes type and horsepower
        public Engine(String type, int horsepower) {
            // Assigns the parameter value to the field "type"
            this.type = type;
            // Assigns the parameter value to the field "horsepower"
            this.horsepower = horsepower;
        }

        // Utility/behavior method: prints a human-readable representation of the engine
        public void printEngine() {
            System.out.println("Engine: " + type + " with " + horsepower + " HP");
        }
    }
}