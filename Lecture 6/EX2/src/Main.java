void main(){
    Circle circle= new Circle(4.5);
    Square square= new Square(6.3);
    Cube cube= new Cube(3.4);
    System.out.println("The area of the cicle is: " + circle.area());
    System.out.println("The perimeter of the circle is: " + circle.perimeter());
    System.out.println("The area of the square is: " + square.area());
    System.out.println("The perimeter of the square is: " + square.perimeter());
    System.out.println("The volume of the cube is: " + cube.volume());
}