public class Dragon implements MC, Guardian, Curser{
    private String name;
    private String treasure;
    private int curseDamage;

    public Dragon(String name, String treasure, int curseDamage) {
        this.name = name;
        this.treasure = treasure;
        this.curseDamage = curseDamage;
    }

    public int getCurseDamage() {
        return curseDamage;
    }

    @Override
    public void castCurs(int damagePoints) {
        System.out.println("Dragon " + name + "makes curse with" + curseDamage + " points");
    }

    @Override
    public void guardTreasure() {
        System.out.println("Dragon " + name + "guarding the treasure" + treasure);
    }

    @Override
    public void interact() {
    System.out.println("Geting in interaction with the dragon" + name);
    }
}
