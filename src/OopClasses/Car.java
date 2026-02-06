package OopClasses;

public class Car {
    String wheels;
    String engineType;

    // initialisation block (se executa inaintea oricarui constructor)
{
System.out.println("Setari comune");
wheels = "unknown";
engineType = "unknown";
}

    // asta e constructorul scris de noi
public Car(String wheels, String engineType) {
       System.out.println("[Constructorul meu] Car(String, String) cu parametri");
       this.wheels = wheels;
       this.engineType = engineType;
}


public static void main(String[] args) {
System.out.println("aici incepe");

// c1: creat cu constructorul fara parametri
//        Car c1 = new Car();

// c2: creat cu constructorul cu parametri
Car c2 = new Car("4wheels", "electric");

//Print starea obiectelor
//System.out.println("c1 -> wheels=" + c1.wheels + ", engineType=" + c1.engineType);
System.out.println("c2 -> wheels=" + c2.wheels + ", engineType=" + c2.engineType);
    }
}