package Enum;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.println(planet.getName() + " " + planet.getDistance());
        }
    }
}
