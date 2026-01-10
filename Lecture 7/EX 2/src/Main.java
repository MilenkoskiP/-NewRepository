public class Main{
    public static void main(String[] args) {
        System.out.println("Welcome to the Shape Shifter’s Workshop!\n");

        Square square = new Square(5.0);
        System.out.println("Square area is: " + square.area());
        System.out.println("Square perimeter is: " + square.perimeter());
        System.out.println();
        Circle circle = new Circle(3.0);
        System.out.println("Circle area is: " + circle.area());
        System.out.println("Circle perimeter is: " + circle.perimeter());
        System.out.println();
        Cube cube = new Cube(4.0);
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());
    }
}