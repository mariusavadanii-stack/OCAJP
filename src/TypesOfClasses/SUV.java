package TypesOfClasses;

// Class SUV extends BaseCar: this is a concrete subclass of the abstract BaseCar class.
// Because BaseCar has an abstract method, SUV must provide its own implementation.
// This class also defines SUV-specific behavior.
public class SUV extends BaseCar {

    // @Override indicates that this method provides the required implementation
    // for the abstract method declared in BaseCar.
    // Here it simply returns 'true', meaning all SUV models are considered available in stock.
    @Override
    public boolean isAvailableInStock() {
        return true;
    }

    // SUV‑specific behavior: activates an off‑road driving mode.
    // This demonstrates how a concrete subclass can define its own features.
    public void offRoadMode() {
        System.out.println("SUV switched to Off-Road mode.");
    }
}