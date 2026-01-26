package OopBasicsPolymorphismOverloading;


public class Main {
    public static void main(String[] args) {
        CarUtils utils = new CarUtils();

        utils.printInfo("VW Polo");          // apeleaza metoda cu 1 parametru
        utils.printInfo("Tesla Model 3", 4); // apelează metoda cu 2 parametri
    }
}
