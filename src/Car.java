public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super (brand,year);
        this.doors = doors;
        this.fuelType = fuelType;

    }

    @Override // реализуем абстрактные методы из Vehicle
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}