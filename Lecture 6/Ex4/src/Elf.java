public class Elf implements Healer,MC,Guardian{
    private String name;
    private String treasure;
    private int curseDamage;
    private int healPower;

    public Elf(String name, String treasure, int curseDamage, int healPower) {
        this.name = name;
        this.treasure = treasure;
        this.curseDamage = curseDamage;
        this.healPower = healPower;
    }

    public int getHealPower() {
        return healPower;
    }

    @Override
    public void guardTreasure() {
        System.out.println("Elf guarding treasure" + treasure);
    }

    @Override
    public void healPlayer(int healthPoints) {
    System.out.println("Elf healing player" + healPower + "points");
    }

    @Override
    public void interact() {
    System.out.println("Interacting with elff...");
    }
}
