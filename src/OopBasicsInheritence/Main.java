package OopBasicsInheritence;


// Main.java
public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW Polo", 4);
        car.startEngine();
        car.openTrunk();


        ElectricCar eCar = new ElectricCar("Tesla Model 3", 4, 80);
        eCar.startEngine();      // moștenit
        eCar.openTrunk();
        eCar.chargeBattery();    // comportament nou
    }
}
