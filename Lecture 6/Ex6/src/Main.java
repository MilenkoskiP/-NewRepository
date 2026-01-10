class Main{
    public static void main(String[] args) {
        Superhero[] heroes = new Superhero[6];
        heroes[0] = new FlyingHero("SkyMaster");
        heroes[1] = new StrengthHero("PowerPunch");
        heroes[2] = new SpeedHero("FlashBolt");
        heroes[3] = new FlyingHero("AeroStar");
        heroes[4] = new StrengthHero("IronFist");
        heroes[5] = new SpeedHero("QuickSilver");

        System.out.println("Battle of the Superheroes Begins!\n");
        for (Superhero hero : heroes) {
            hero.fight();
        }
    }
}