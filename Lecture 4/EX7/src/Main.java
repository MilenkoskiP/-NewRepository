public class Main {
    public static void main(String[] args) {
        Spaceship[] fleetShips = new Spaceship[5];
        fleetShips[0] = new Spaceship("Nebula", 50, 200, 150);
        fleetShips[1] = new Spaceship("Orion", 60, 180, 160);
        fleetShips[2] = new Spaceship("Phoenix", 55, 220, 140);
        fleetShips[3] = new Spaceship("Titan", 65, 190, 155);
        fleetShips[4] = new Spaceship("Eclipse", 58, 210, 145);

        Fleet fleet = new Fleet(fleetShips);

        fleet.simulateBattle();

        System.out.println("Fleet Status After Battle:");
        fleet.displayFleet();

        System.out.println("\nSpaceship with the Highest Firepower:");
        Spaceship topShip = fleet.getHighestFirepowerShip();
        topShip.displayDetails();
    }
}