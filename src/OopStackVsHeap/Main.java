package OopStackVsHeap;

public class Main {

    public static void main(String[] args) {
        int x = 10; // value type -> stored in STACK

        Car myCar = createCar();    // 'myCar' = pointer in STACK -> the Car object = stored in HEAP

        System.out.println("Car model: " + myCar.model + " " + myCar.year);

    }

    public static Car createCar() {
        String m = "Toyota"; // local variable inside method -> reference type -> pointer in STACK, string literal "Toyota" in HEAP
        int y = 2020;     // local variable inside method -> value type -> stored in STACK

        Car c = new Car(m, y); // 'c' = pointer in STACK -> the Car object = stored in HEAP

        return c;  // The pointer 'c' is copied back to the main() STACK frame.
        // The Car object itself remains on the HEAP.
        // Local variables m, y, and c disappear after the method ends (their stack frames are cleared).
        // The object stays in the HEAP because a reference to it was returned.
    }
}
