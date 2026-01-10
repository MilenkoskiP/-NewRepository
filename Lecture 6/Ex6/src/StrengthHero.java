class StrengthHero extends Superhero {
    public StrengthHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " uses super strength to overpower enemies!");
    }
}