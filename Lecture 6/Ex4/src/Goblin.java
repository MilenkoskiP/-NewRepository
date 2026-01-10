public class Goblin implements MC,Guardian,Curser{
    private String name;
    private String treasure;
    private int curseDamage;

    public Goblin(String name, String treasure, int curseDamage) {
        this.name = name;
        this.treasure = treasure;
        this.curseDamage = curseDamage;
    }

    public int getCurseDamage() {
        return curseDamage;
    }

    @Override
    public void castCurs(int damagePoints) {
        System.out.println("Goblin casting curse " + curseDamage + "points");
    }

    @Override
    public void guardTreasure() {
    System.out.println("Goblin guarding treasure");
    }

    @Override
    public void interact() {
    System.out.println("Welcome goblin" + name);
    }
}
