package OopStackVsHeap;

public class Car {
    String model;  // reference type -> goes on HEAP (the object), pointer in STACK
    int year;      // value type -> stored inside the object on HEAP

    public Car(String model, int year) {
        this.model = model;  // field  of the object in HEAP ; set the object's field with the value the parameter
        this.year = year;


    }
}