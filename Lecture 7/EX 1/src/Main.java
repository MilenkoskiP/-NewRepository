public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the" + Animal.KINGDOM_NAME + " Council Meeting!\n");
        Animal lion = new Lion();
        Animal bird = new Bird();
        Animal Fish = new Fish();

        System.out.println("Lion: ");
        lion.sound();
        lion.move();
        lion.sleep();
        System.out.println();
        System.out.println("Bird: ");
        bird.sound();
        bird.move();
        bird.sleep();
        System.out.println();
        System.out.println("Fish: ");
        Fish.sound();
        Fish.move();
        Fish.sleep();
    }
}