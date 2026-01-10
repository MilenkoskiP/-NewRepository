public class FlyingCar implements Vehicle, GroundTransport, AirTransport{
    private double fuelCapacity;
    private int passengerCapacity;
    private String terrainType;
    private double maxAltitude;

    public FlyingCar(double fuelCapacity, int passengerCapacity, String terrainType, double maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.maxAltitude = maxAltitude;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
    }

    @Override
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void drive() {
        System.out.println("FlyingCar is driving on " + terrainType + ".");
    }

    @Override
    public String getTerrainType() {
        return terrainType;
    }
    @Override
    public void fly() {
        System.out.println("FlyingCar is flying on " + maxAltitude + ".");
    }
    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }
}
