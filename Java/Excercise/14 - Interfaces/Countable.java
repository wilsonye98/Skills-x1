package Interfaces;

public interface Countable {
    default void printInfo() {
        System.out.println("Printing");
    }
}
