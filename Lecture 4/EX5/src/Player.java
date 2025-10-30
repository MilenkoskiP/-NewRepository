public class Player {
    private int strength;
    private int health;

    public Player(int strength, int health) {
        this.strength = strength;
        this.health = health;
    }

    public boolean fight(Room room) {
        System.out.println("Encountered a creature with Strength: " + room.getCreatureSrenght() +
                " and Health: " + room.getCreatureHealth());

        if (strength >= room.getCreatureSrenght()) {
            System.out.println("Player defeats the creature!");
            return true;
        } else {
            health -= room.getCreatureSrenght();
            System.out.println("Creature attacks! Player's health reduced by " + room.getCreatureSrenght());
            if (health > 0) {
                System.out.println("Player survives with " + health + " health remaining.");
                return true;
            } else {
                System.out.println("Player has been defeated!");
                return false;
            }
        }
    }

    public int getHealth() {
        return health;
    }
}
