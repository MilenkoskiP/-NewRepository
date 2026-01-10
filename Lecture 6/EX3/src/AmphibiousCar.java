public class AmphibiousCar implements Vehicle, GroundTransport {

    private double fuelCapacity;
    private int passengerCapacity;
    private String terrainType;

    public AmphibiousCar(double fuelCapacity, int passengerCapacity, String terrainType) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
    }

    @Override
    public double getFuleCapacity() {
        return fuelCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Amphibious car is driving on " +  );
    }

    @Override
    public String getTerrainType() {
        return terrainType;
    }


    @Override
    public int getCapacity() {
        return passengerCapacity;
    }
}
