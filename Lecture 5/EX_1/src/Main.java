void main() {
    Vehicle vehicle1= new Vehicle("Tesla", 4,50.0,5.5);
    Vehicle vehicle2= new Vehicle("RoadRunner", 2,40.0,4.0);
    System.out.println("Vehicle 1 can go " + vehicle1.howFare());
    System.out.println("Vehicle 2 can go " + vehicle2.howFare());
    vehicle1.compare(vehicle2);
}
