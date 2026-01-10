//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Dragon dragon= new Dragon("Darco","gold", 50);
    Elf elf = new Elf("Elmar","Silver", 30);
    Goblin goblin= new Goblin("Davor", "Diamond", 20);

    dragon.interact();
    dragon.guardTreasure();
    dragon.castCurs(dragon.getCurseDamage());

    elf.guardTreasure();
    elf.guardTreasure();
    elf.healPlayer(elf.healPlayer());

    goblin.interact();
    goblin.guardTreasure();

}
