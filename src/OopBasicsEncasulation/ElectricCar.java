package OopBasicsEncasulation;

public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String model, int doors, int batteryLevel) {
        super(model, doors);
        setBatteryLevel(batteryLevel);
    }

    public void chargeBattery() {
        if (!engineRunning) { // engineRunning este "protected" în Car
            System.out.println("Charging battery... Current level: " + batteryLevel + "%");
        } else {
            System.out.println("Cannot charge while engine is running!");
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100) {
            throw new IllegalArgumentException("Battery level must be between 0 and 100!");
        }
        this.batteryLevel = batteryLevel;
    }
}
