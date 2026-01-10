public class Cube implements ThreeDimensionalShape{
    public Cube(double side) {
        this.side = side;
    }

    private double side;

    @Override
    public double volume() {
        return side*3;
    }
}
