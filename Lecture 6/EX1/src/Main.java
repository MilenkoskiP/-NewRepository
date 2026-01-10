public class Main {
    public static void main(String[] args){
        Egg egg = new Egg();
        System.out.println("Regular Egg: ");
        egg.EGG();
        egg.print();

        OstrichEgg e = new OstrichEgg();
        System.out.println("Ostrich Egg: ");
        e.EGG();
        e.print();
    }
}