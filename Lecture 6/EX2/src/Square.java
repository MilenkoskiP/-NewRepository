public class Square implements TwoDimensionalShape{
    public Square(double a) {
        this.a = a;
    }

    private double a;

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double perimeter() {
        return 4*a*a;
    }
}
