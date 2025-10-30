public class Hero1 {
    private int strength;
    private int health;

    public Hero1(int strength, int health) {
        this.strength = strength;
        this.health = health;
    }

    public void displayStats() {
        System.out.println("Hero details: ");
        System.out.println("strength: " + strength);
        System.out.println("health: " + health);
    }

    public void TakeDamage(int damage) {
        System.out.println("Taking damage: " + damage);
        if (damage >= this.health) {
            System.out.println("You got Killed XD!");
        }
        this.health -= damage;
    }

    public void PowerUp(int power) {
        System.out.println("Power up: " + power);
        this.strength += power;
    }
}
