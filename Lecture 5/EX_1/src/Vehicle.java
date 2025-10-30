public class Vehicle {
    private String model;
    private int nomberOfPass;
    private  double gasTankCapacity; // liters
    private  double fuleConsumption; //liters per 100 km

    public Vehicle(String model, int nomberOfPass, double gasTankCapacity, double fuleConsumption) {
        this.model = model;
        this.nomberOfPass = nomberOfPass;
        this.gasTankCapacity = gasTankCapacity;
        this.fuleConsumption = fuleConsumption;
    }

    public double howFare(){
        double fuleConsumptionPerKm = fuleConsumption/100;
        return gasTankCapacity/fuleConsumptionPerKm;
    }
    public void compare(Vehicle other){
        double reuslt1= this.howFare();
        double reuslt2= other.howFare();
        if(reuslt1>reuslt2){
            System.out.println(model + " can go further than" + other.model);
        } else if (reuslt2>reuslt1) {
            System.out.println(other.model + " can go further than" + model);
        }else {
            System.out.println(" Both have the same range.");
        }
    }
}
