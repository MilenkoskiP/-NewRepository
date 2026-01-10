abstract class Vehicle {
    public abstract void move();
    public abstract void refuel();
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }
}
