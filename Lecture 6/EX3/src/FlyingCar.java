public class FlyingCar implements Vehicle, AirTransport, GroundTransport{
    private double fuelCapacity;
    private int passengerCapacity;
    private String terrainType;
    private double maxAltitude;

    public FlyingCar(double fuelCapacity, int passengerCapacity, String terrainType, double maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void fly() {
        System.out.println("Flying car flies up to " + maxAltitude + );
    }

    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }

    @Override
    public void drive() {
        System.out.println("Flying car drives up to " + maxAltitude );
    }

    @Override
    public String getTerrainType() {
        return "";
    }

    @Override
    public double getFuleCapacity() {
        return terrainType;
    }

    @Override
    public int getCapacity() {
        return ;
    }
}
