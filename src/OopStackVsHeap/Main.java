package OopStackVsHeap;

public class Main {

    public static void main(String[] args) {
        int x = 10; // value type -> stored in STACK

        Car myCar = createCar();    // 'myCar' = pointer in STACK -> the Car object = stored in HEAP

        System.out.println("Car model: " + myCar.model + " " + myCar.year);

    }

    public static Car createCar() {
        String m = "Toyota"; // local variable inside method -> reference type -> pointer in STACK, string literal in HEAP
        int y = 2020;     // local variable inside method -> value type -> STACK

        Car c = new Car(m, y); // 'c' pointer in STACK ->  Car object in HEAP

        return c;  // pointer is copied back to main() STACK frame
        // the Car object remains on HEAP
        // local variables m, y, c disappear after the method ends (stack cleared)
        // object stays because the pointer was returned
    }
}
