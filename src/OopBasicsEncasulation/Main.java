package OopBasicsEncasulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("VW Polo", 4);
        car.startEngine();
        car.openTrunk();
        car.stopEngine();


        // car.model = "Dacia"; //  nu merge (private)

        ElectricCar eCar = new ElectricCar("Tesla Model 3", 4, 80);
        eCar.startEngine();
        eCar.stopEngine();
        eCar.chargeBattery(); // OK


        // incercare invalida:
        try {
            eCar.setBatteryLevel(150); //  va arunca excepție
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // get values through encapsulated methods
        System.out.println("Model: " + eCar.getModel());
        System.out.println("Battery: " + eCar.getBatteryLevel() + "%");
    }
}
