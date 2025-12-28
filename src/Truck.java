public class Truck extends Vehicle {

    private double capacity;
    private int numberOfAxles;

    public Truck(String brand, int year, double capacity, int numberOfAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numberOfAxles = numberOfAxles;
    }
    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped.");
    }
}
