package OopBasicsPolymorphismOverriding;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();          // obiect Car
        Car car2 = new ElectricCar();  // referinta Car -> obiect ElectricCar (adica obiectul este vazut de compilator de tipul Car -> dar obiectul real creat
                                       // in memorie este de tipul ElectricCar )
                                       // Car - ce stie compilatorul vs ElectricCar - ce se executa efectiv la runtime

        car1.startEngine(); // Motor standard pornit.
        car2.startEngine(); // Motor electric pornit.  (se decide ce metoda sa se execute runtime)
    }
}
