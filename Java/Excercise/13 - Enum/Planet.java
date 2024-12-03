package Enum;

public enum Planet {
    N1("Saturn", 1130),
    N2("Mars", 1542);

    private double distance;
    private String name;

    Planet(String name, double number) {
        this.name = name;
        this.distance = number;
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
