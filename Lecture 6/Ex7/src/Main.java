class Main{
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Sedan");
        vehicles[1] = new Motorcycle("Harley");
        vehicles[2] = new ElectricCar("Tesla Model S");

        for(Vehicle v : vehicles){
            if(v instanceof ElectricCar){
                ElectricCar car = (ElectricCar) v;
                car.move();
                car.refuel();
                car.refuel(5);
            }else {
                v.move();
                v.refuel();
                System.out.println();
            }
        }
    }
}