public class Spaceshuttel implements Vehicle,AirTransport,SpaceTransport{
    private double fuelCapacity;
    private int passengerCapacity;
    private double orbitRange;
    private double maxAltitude;

    public Spaceshuttel(double fuelCapacity, int passengerCapacity, double orbitRange, double maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.orbitRange = orbitRange;
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void fly() {
        System.out.println("Space shuttel flies up to " + maxAltitude);
    }

    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }

    @Override
    public void launch() {
    System.out.println("Space shuttel launches up to" + maxAltitude);
    }

    @Override
    public double getOrbitRange() {
        return 0;
    }

    @Override
    public double getFuleCapacity() {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
