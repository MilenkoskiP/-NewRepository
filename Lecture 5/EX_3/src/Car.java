public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private  Door[]  doors;
    private boolean isClosedTrunk;

    public Car( int numberWheels, int numberDoors ) {
        engine = new Engine();
        wheels = new Wheel[numberWheels];
        doors = new Door[numberDoors];
        isClosedTrunk = false;
        for (int i = 0; i < numberWheels; i++) {
            wheels[i] = new Wheel();
        }
        for (int i = 0; i < numberDoors; i++) {
            doors[i] = new Door();
        }
        }
        public void startEngine() {
        engine.start();
        }
        public void stopEngine() {
        engine.Stop();
        }
        public void openAllDoors() {
        for (int i = 0; i < doors.length; i++) {
            doors[i].openDoor();
        }
        }
        public void closeAllDoors() {
        for (int i = 0; i < doors.length; i++) {
            doors[i].closedDoor();
        }
        }
    public void inflatedWheels(int wheelIndex) {
        if (wheelIndex >= 0 && wheelIndex < wheels.length) {
            wheels[wheelIndex].inflatedWheel();
        } else {
            System.out.println("Invalid wheel index");
        }
    }

    public void openTrunk() {
        if (isClosedTrunk) {
            isClosedTrunk = false;
            System.out.println("Trunk is now open");
        } else {
            System.out.println("Trunk is already open");
        }
    }

    public void closeTrunk() {
        if (!isClosedTrunk) {
            isClosedTrunk = true;
            System.out.println("Trunk is now closed");
        } else {
            System.out.println("Trunk is already closed");
        }
    }

}

