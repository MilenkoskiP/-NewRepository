public class Car {
    private String type;
    private int noSeats;
    private String fuelType;
    private String color;

    public Car(String type, int noSeats, String fuelType, String color) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuelType = fuelType;
        this.color = color;
    }
    public Car() {
        type = "BMW";
        noSeats = 5;
        fuelType = "Petrol";
        color = "Black/Red";
    }
    public int getNoSeats() {
        return noSeats;
    }

    public String getFuelType() {
        return fuelType;
    }
    public String getColor() {
        return color;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void printCar() {
        System.out.println("\nCar details: ");
        System.out.println("Type of Car: " + type);
        System.out.println("Type of Fuel: " + fuelType);
        System.out.println("Color : " + color);
        System.out.println("Seats : " + noSeats);
        System.out.println("________________");
    }
}
