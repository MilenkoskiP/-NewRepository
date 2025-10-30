public class Spaceship {
    private String name;
    private int crewSize;
    private int firepower;
    private int shieldStrength;

    public Spaceship(String name, int crewSize, int firepower, int shieldStrength) {
        this.name = name;
        this.crewSize = crewSize;
        this.firepower = firepower;
        this.shieldStrength = shieldStrength;
    }

    public String getName() {
        return name;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public int getFirepower() {
        return firepower;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void increaseFirepower(int amount) {
        firepower += amount;
        System.out.println(name + " firepower increased by " + amount + ". New firepower: " + firepower);
    }

    public void repairShields(int amount) {
        shieldStrength += amount;
        System.out.println(name + " shield strength repaired by " + amount + ". New shield strength: " + shieldStrength);
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Crew Size: " + crewSize +
                ", Firepower: " + firepower + ", Shield Strength: " + shieldStrength);
    }
}
