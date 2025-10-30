void main(){
    Hero1 hero=new Hero1(50, 60);
    System.out.println("Initial hero status");
    hero.displayStats();
    hero.TakeDamage(70);
    hero.PowerUp(15);
    System.out.println("Updated hero status");
    hero.displayStats();
}