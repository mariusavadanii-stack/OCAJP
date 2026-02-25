package TypesOfClasses;

// Abstract class BaseCar: acts as a template for all car types.
// It cannot be instantiated directly and requires subclasses to implement abstract methods.
// This class also provides common behavior shared by all car types.
public abstract class BaseCar {

    // Private field storing the car's name.
    // This value can be assigned through the setter method.
    private String name;

    // Private field indicating whether delivery is available for this car.
    // Also only modifiable through its setter.
    private boolean deliveryAvailable;

    // Abstract method: must be implemented by every subclass of BaseCar.
    // Determines whether the specific car model is available in stock.
    public abstract boolean isAvailableInStock();

    // Shared behavior: prints a simple message when the car starts.
    public void start() {
        System.out.println(name + " is starting...");
    }

    // Shared behavior: prints a message when the car stops.
    public void stop() {
        System.out.println(name + " is stopping...");
    }

    // Shared behavior: prints delivery availability based on the internal flag.
    public void deliver() {
        if (deliveryAvailable) {
            System.out.println(name + " is available for delivery.");
        } else {
            System.out.println(name + " cannot be delivered.");
        }
    }

    // Setter method for the car's name.
    // Allows assigning a value to the private 'name' field.
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for the delivery availability flag.
    // Allows assigning a value to the private 'deliveryAvailable' field.
    public void setDeliveryAvailable(boolean deliveryAvailable) {
        this.deliveryAvailable = deliveryAvailable;
    }
}