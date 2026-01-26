package OopBasicsPolymorphismOverriding;

// Subclasa – rescrie metoda (overriding)
class ElectricCar extends Car {
    @Override
    public void startEngine() {
        System.out.println("Motor electric pornit.");
    }
}
