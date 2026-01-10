public class Motorcycle extends Vehicle {
    public Motorcycle(String model) {
        super(model);
    }
    @Override
    public void move() {
        System.out.println(model + " is speeding down the highway.");
    }
    @Override
    public void refuel() {
        System.out.println("Refueling " + model + " with gasoline.");
    }
}
