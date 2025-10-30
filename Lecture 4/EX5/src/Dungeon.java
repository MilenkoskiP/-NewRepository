public class Dungeon {
    private Room[] rooms;

    public Dungeon(int numberOfRooms) {
        rooms = new Room[numberOfRooms];
        for (int i = 0; i < numberOfRooms; i++) {
            rooms[i] = new Room();
        }
    }

    public Room[] getRooms() {
        return rooms;
    }
}
