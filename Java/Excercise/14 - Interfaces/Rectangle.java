package Interfaces;

public class Rectangle implements Countable, Drawable {

    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    public void printInfo() {
        System.out.println("Rectangle info.");
    }
}
