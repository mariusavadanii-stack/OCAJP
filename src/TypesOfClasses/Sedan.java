package TypesOfClasses;

// Class Sedan extends BaseCar: this is a concrete subclass of the abstract BaseCar class.
// Because BaseCar contains an abstract method, Sedan must provide its own implementation.
// This class also defines a Sedan-specific feature for demonstration purposes.
public class Sedan extends BaseCar {

    // @Override indicates that this method provides the required implementation
    // for the abstract method declared in BaseCar.
    // Here it simply returns 'true', meaning all Sedan models are considered available in stock.
    @Override
    public boolean isAvailableInStock() {
        return true;
    }

    // Sedan-specific behavior: represents a unique comfort/luxury feature.
    // This method is used in the Demo class to show subclass-specific behavior.
    public void luxuryFeature() {
        System.out.println("Sedan has a massage seat feature.");
    }
}