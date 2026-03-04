package Interfaces;

public interface Vehicle {

    void start();
    void stop();

    default void honk() {
        System.out.println("Beep beep!");
    }

    static int getDefaultWheels() {
        return 4;
    }
}
