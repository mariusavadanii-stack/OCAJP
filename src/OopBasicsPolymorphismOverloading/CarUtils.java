package OopBasicsPolymorphismOverloading;

public class CarUtils {

    // CarUtils este o clasa de utilitati care doar primeste informatia ca parametri si o afiseaza.
    // (overloading): aceeași metoda, alți parametri

    // afișeaza doar modelul
    public void printInfo(String model) {
        System.out.println("Model: " + model);
    }

    //  afiseaza model + numar de usi
    public void printInfo(String model, int doors) {
        System.out.println("Model: " + model + ", Uși: " + doors);
    }
}
