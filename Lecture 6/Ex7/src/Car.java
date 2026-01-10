public class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + " is driving on the road.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + model + " with gasoline.");
    }
}
