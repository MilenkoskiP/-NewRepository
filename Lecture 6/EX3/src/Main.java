public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[5];
        animal[0]= new Dog("Buddy");
        animal[1]=new Lion("Simba");
        animal[2]=new Frog("Freddy");
        animal[3]=new SaraMountainDog("Max");
        animal[4]=new Animal("GenericAnimal");

        for(Animal a:animal){
            a.onomatopoeia();

            if(a instanceof SaraMountainDog){
                SaraMountainDog specificDog = (SaraMountainDog)a;
                specificDog.traits();
            }
        }
    }
}