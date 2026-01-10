public class FlyingHero extends Superhero {
    public FlyingHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " takes to the skies and attacks from above!");
    }
}
