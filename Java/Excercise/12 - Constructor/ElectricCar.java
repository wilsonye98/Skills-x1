package Constructor;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(int battery, String model, String brand) {
        super(model, brand);
        this.batteryCapacity = battery;
    }
}
