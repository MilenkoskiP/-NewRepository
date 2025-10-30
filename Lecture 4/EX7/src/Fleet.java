import java.util.Random;

public class Fleet {
    private Spaceship[] ships;

    public Fleet(Spaceship[] ships) {
        this.ships = ships;
    }

    public Spaceship[] getShips() {
        return ships;
    }

    public void simulateBattle() {
        Random rand = new Random();
        System.out.println("Battle Simulation Begins!\n");
        for (Spaceship ship : ships) {
            System.out.println("Processing " + ship.getName() + ":");
            int event = rand.nextInt(2);
            if (event == 0) {
                int increase = rand.nextInt(21) + 10;
                ship.increaseFirepower(increase);
            } else {
                int repair = rand.nextInt(21) + 5;
                ship.repairShields(repair);
            }
            System.out.println();
        }
    }

    public Spaceship getHighestFirepowerShip() {
        Spaceship highest = ships[0];
        for (int i = 1; i < ships.length; i++) {
            if (ships[i].getFirepower() > highest.getFirepower()) {
                highest = ships[i];
            }
        }
        return highest;
    }

    public void displayFleet() {
        for (Spaceship ship : ships) {
            ship.displayDetails();
        }
    }
}