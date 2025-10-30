import java.util.Random;

public class Room {
    private int creatureSrenght;
    private int creatureHealth;

    public Room(){
        Random rand = new Random();
        this.creatureSrenght = rand.nextInt(50)+ 10;
        this.creatureHealth = rand.nextInt(100) + 20;
    }

    public void displayStats(){
        System.out.println("Creature Stats:");
        System.out.println("Creature Srenght: " + creatureSrenght);
    }
    public void setCreatureSrenght(int creatureSrenght){
        this.creatureSrenght = creatureSrenght;
    }
    public void setCreatureHealth(int creatureHealth){
        this.creatureHealth = creatureHealth;
    }
    public int  getCreatureSrenght(){
        return creatureSrenght;
    }
    public int getCreatureHealth(){
        return creatureHealth;
    }

}