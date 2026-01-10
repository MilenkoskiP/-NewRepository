class ElectricCar extends Vehicle {
    public ElectricCar(String model) {
        super(model);
    }
    @Override
    public void move() {
        System.out.println(model + " is driving silently on the road.");
    }
    @Override
    public void refuel() {
        System.out.println("Charging " + model + " with electricity.");
    }
    public void refuel(int chargingTimeInHours) {
        System.out.println("Charging " + model + " for " + chargingTimeInHours + " hours.");
    }
}
