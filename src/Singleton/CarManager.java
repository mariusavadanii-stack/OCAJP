package Singleton;

public class CarManager {

    private static CarManager instance;   // create a variable which will hold the only instance of the class
                                            // static - it belongs to class not object
                                            // initial value it's null

    private CarManager() {
        // private constructor nobody from outside the class can write "new CarManager"
        // essential for singleton
    }

    public static CarManager getInstance() { // public method through we get Singleton instance
        if (instance == null) {
            instance = new CarManager(); // if instance does not exists we will create it (the only time)
        }
        return instance;  // if instance exists is returned without creation
    }

    public void serviceCar(Car car) {  // public method - received a Car object
        System.out.println("Servicing: " + car);
    }
}
