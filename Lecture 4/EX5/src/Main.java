void main(){
    Player player = new Player(50, 100);
    Dungeon dungeon = new Dungeon(5);

    boolean escaped = true;
    Room[] rooms = dungeon.getRooms();

    for (int i = 0; i < rooms.length; i++) {
        System.out.println("\nEntering Room " + (i + 1));
        boolean result = player.fight(rooms[i]);
        if (!result) {
            escaped = false;
            break;
        }
    }

    if (escaped) {
        System.out.println("\nCongratulations! You have escaped the dungeon.🥳");
    } else {
        System.out.println("\nYou were defeated in the dungeon.😢");
    }
}