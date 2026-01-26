package OopBasicsInheritence;


// ElectricCar.java
public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String model, int doors, int batteryLevel) {
        super(model, doors);
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery() {
        System.out.println("Charging battery... Current level: " + batteryLevel + "%");
    }
}
